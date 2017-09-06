package controllers;
import api.TagResponse;
import dao.TagDao;

import generated.tables.records.TagsRecord;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.List;

import static java.util.stream.Collectors.toList;

@Path("")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)

public class TagController {
    final TagDao tags;

    public TagController(TagDao tags) { this.tags = tags;}

    @GET
    @Path("/tags")
    public List<TagResponse> getTags() {
        List<TagsRecord> tagsRecord = tags.getAllTags();
        return tagsRecord.stream().map(TagResponse::new).collect(toList());
    }

    @GET
    @Path("/tags/{tag}")
    public List<TagResponse> getTags(@PathParam("tag") String tagName) {
        List<TagsRecord> tagsRecord = tags.getAllTagsByName(tagName);
        return tagsRecord.stream().map(TagResponse::new).collect(toList());
    }

    @PUT
    @Path("/tags/{tag}")
    public void toggleTag(@PathParam("tag") String tagName, int ReceiptId) {
        tags.ToggleInTable(ReceiptId, tagName);

    }

    @GET
    @Path("/netid")
    public String getNetId() {

        return "fm399";
    }

}