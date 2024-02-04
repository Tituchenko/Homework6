package ru.gb.Homework6.models;

import lombok.Data;

import java.util.Date;
@Data
public class Result {
        private Integer id;
        private String name;
        private String status;
        private String species;
        private String type;
        private String gender;
        private String image;
        private String url;
        private Date created;

}
