package com.example.demo;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Record {
 private static DateTimeFormatter fmt = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");

 private LocalDateTime datetime;
 private String name;
 private String contents;

 public Record(String name, String contents) {
  super();
  this.name = name;
  this.contents = contents;
  this.datetime = LocalDateTime.now();
 }

 public String getDatetime() {
  return datetime.format(fmt);
 }

 public String getName() {
  return name;
 }

 public String getContents() {
  return contents.replaceAll("\n", "<br>");
 }
}
