package dao;

import generated.tables.records.TagsRecord;
import org.jooq.Configuration;
import org.jooq.DSLContext;
import org.jooq.impl.DSL;

import java.util.List;

import static generated.Tables.TAGS;

public class TagDao {
    DSLContext dsl;

    public TagDao(Configuration jooqConfig) {
        this.dsl = DSL.using(jooqConfig);
    }

    public void insert(int ReceiptId, String tag) {

        dsl.insertInto(TAGS, TAGS.RECEIPTID, TAGS.TAG )
           .values(ReceiptId, tag)
           .returning()
           .fetchOne();


      
    }

    public void ToggleInTable(int ReceiptId, String tag){

       int exists = dsl.selectCount()
               .from(TAGS)
               .where((TAGS.RECEIPTID.eq(ReceiptId)).and(TAGS.TAG.eq(tag)))
               .fetchOne(0, int.class);

        if (exists == 0) {
            dsl.insertInto(TAGS, TAGS.RECEIPTID, TAGS.TAG).values(ReceiptId, tag).returning().fetchOne();
        }
        else dsl.deleteFrom(TAGS).where(TAGS.TAG.eq(tag)).and(TAGS.RECEIPTID.eq(ReceiptId)).execute(); 



    }

    public List<TagsRecord> getAllTags () {
        return dsl.selectFrom(TAGS).fetch();
    }

    public List<TagsRecord> getAllTagsByName (String tag) {
        return dsl.select().from(TAGS).where(TAGS.TAG.eq(tag)).fetchInto(TAGS);
    }


}

