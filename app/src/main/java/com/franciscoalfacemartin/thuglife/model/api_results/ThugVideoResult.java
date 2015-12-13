package com.franciscoalfacemartin.thuglife.model.api_results;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

public class ThugVideoResult {

    @SerializedName( "items" ) public List<Item> items = new ArrayList<Item>();

    public class High {

        @SerializedName( "url" )  public String url;
        @SerializedName( "width" )  public Integer width;
        @SerializedName( "height" )  public Integer height;
    }

    public class Item {

        @SerializedName( "kind" )  public String kind;
        @SerializedName( "etag" )  public String etag;
        @SerializedName( "id" )  public String id;
        @SerializedName( "snippet" )  public Snippet snippet;
    }

    public class Medium {

        @SerializedName( "url" )  public String url;
        @SerializedName( "width" )  public Integer width;
        @SerializedName( "height" )  public Integer height;
    }


    public class PageInfo {

        @SerializedName( "totalResults" )  public Integer totalResults;
        @SerializedName( "resultsPerPage" )  public Integer resultsPerPage;
    }

    public class ResourceId {

        @SerializedName( "kind" )  public String kind;
        @SerializedName( "videoId" )  public String videoId;
    }


    public class Snippet {

        @SerializedName( "publishedAt" )  public String publishedAt;
        @SerializedName( "channelId" )  public String channelId;
        @SerializedName( "title" )  public String title;
        @SerializedName( "description" )  public String description;
        @SerializedName( "thumbnails" )  public Thumbnails thumbnails;
        @SerializedName( "channelTitle" )  public String channelTitle;
        @SerializedName( "playlistId" )  public String playlistId;
        @SerializedName( "position" )  public Integer position;
        @SerializedName( "resourceId" )  public ResourceId resourceId;
    }


    public class Thumbnails {

        @SerializedName( "default" )  public Default _default;
        @SerializedName( "medium" )  public Medium medium;
        @SerializedName( "high" )  public High high;
    }

    public class Default {

        @SerializedName("url")
        public String url;
        @SerializedName("width")
        public Integer width;
        @SerializedName("height")
        public Integer height;

    }
}