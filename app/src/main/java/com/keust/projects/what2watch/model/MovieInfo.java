package com.keust.projects.what2watch.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import java.util.Date;

public class MovieInfo {
    @Expose
    private long id;

    @Expose
    private String title;

    @SerializedName("vote_count")
    @Expose
    private int voteCount;

    @SerializedName("vote_average")
    @Expose
    private Double voteAverage;

    @SerializedName("video")
    @Expose
    private Boolean hasVideo;

    @Expose
    private Double popularity;

    @SerializedName("poster_path")
    @Expose
    private String posterPath;

    @SerializedName("original_language")
    @Expose
    private String originalLanguage;

    @SerializedName("original_title")
    @Expose
    private String originalTitle;

    @SerializedName("genre_ids")
    @Expose
    private long[] genreIds;

    @SerializedName("backdrop_path")
    @Expose
    private String backdropPath;

    @SerializedName("adult")
    @Expose
    private Boolean isAdult;

    @Expose
    private String overview;

    @SerializedName("release_date")
    @Expose
    private Date releaseDate;
}
