package com.vatsalya.miscellaneous.dto;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.cassandra.core.mapping.Column;
import org.springframework.data.cassandra.core.mapping.Table;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.time.LocalDate;

@Table(value= "movies_metadata")
@Data
public class MoviesEntity {

    @Id
    @Column("id")
    private String id;

    @Column("belongs_to_collection")
    private String belongsToCollection;

    @Column("budget")
    private Long budget;

    @Column("genres")
    private String genres;

    @Column("homepage")
    private String homepage;

    @Column("imdb_id")
    private String imdbId;

    @Column("original_language")
    private String originalLanguage;

    @Column("original_title")
    private String originalTitle;
    @Column("overview")
    private String overview;

    @Column("popularity")
    private Float popularity;

    @Column("poster_path")
    private String posterPath;
    @Column("production_companies")
    private String productionCompanies;
    @Column("production_countries")
    private String productionCountries;
    @Column("release_date")
    private LocalDate releaseDate;
    @Column("revenue")
    private Double revenue;
    @Column("runtime")
    private String runTime;
    @Column("spoken_languages")
    private String spokenLanguages;
    @Column("status")
    private String status;
    @Column("tagline")
    private String tagline;
    @Column("title")
    private String title;
    @Column("video")
    private String video;
    @Column("vote_average")
    private BigDecimal voteAverage;
    @Column("vote_count")
    private int voteCount;
}
