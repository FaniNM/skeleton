package api;

import com.fasterxml.jackson.annotation.JsonProperty;
import generated.tables.records.TagsRecord;

import java.sql.Time;

public class TagResponse {
        @JsonProperty
        Integer id;

        @JsonProperty
        Time created;

        @JsonProperty
        String tag;


        public TagResponse (TagsRecord dbRecord) {
            this.tag = dbRecord.getTag();
            this.created = dbRecord.getUploaded();
            this.id = dbRecord.getReceiptid();
        }
}
