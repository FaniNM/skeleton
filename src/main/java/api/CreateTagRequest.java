package api;

import org.hibernate.validator.constraints.NotEmpty;


public class CreateTagRequest {
    @NotEmpty
    public String tag;

    public int receiptId ;
    }

