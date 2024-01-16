package com.SpringBoot.learnjpaandhibernate;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;


    @Entity
    public  class Course {
        @Id
        private int id;
        private String name;
        private String lastName;

        public Course() {
        }

        public Course(int id, String name, String lastName) {
            this.id = id;
            this.name = name;
            this.lastName = lastName;
        }


        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getLastName() {
            return lastName;
        }

        public void setLastName(String lastName) {
            this.lastName = lastName;
        }
    }

