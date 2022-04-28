import com.fasterxml.jackson.annotation.JsonProperty;

public class FactsAboutCats {
    @JsonProperty("id")
    private String id;
    @JsonProperty("text")
    private String text;
    @JsonProperty("type")
    private String type;
    @JsonProperty("user")
    private String user;
    @JsonProperty("upvotes")
    private int upvotes;

    public String getId(){
        return id;
    }

    public FactsAboutCats setId(){
        this.id = id;
        return this;
    }

    public String getText(){
        return text;
    }

    public FactsAboutCats setText(){
        this.text = text;
        return this;
    }

    public String getType(){
        return type;
    }

    public FactsAboutCats setType(){
        this.type = type;
        return this;
    }

    public String getUser(){
        return user;
    }

    public FactsAboutCats setUser(){
        this.user = user;
        return this;
    }

    public int getUpvotes(){
        return upvotes;
    }

    public FactsAboutCats setUpvotes(){
        this.upvotes = upvotes;
        return this;
    }
}
