package com.derekriddle.lil.roomreservationservice;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Room {
  private long id;
  private String name;
  private String roomNumber;
  private String bedInfo;
}
