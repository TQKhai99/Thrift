/**
 * Autogenerated by Thrift Compiler (0.14.2)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.khaitq2.songservice;


@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.14.2)", date = "2021-08-10")
public enum Error implements org.apache.thrift.TEnum {
  FAIL(0),
  SUCCESS(1),
  INVALID_DATA(2);

  private final int value;

  private Error(int value) {
    this.value = value;
  }

  /**
   * Get the integer value of this enum value, as defined in the Thrift IDL.
   */
  public int getValue() {
    return value;
  }

  /**
   * Find a the enum type by its integer value, as defined in the Thrift IDL.
   * @return null if the value is not found.
   */
  @org.apache.thrift.annotation.Nullable
  public static Error findByValue(int value) { 
    switch (value) {
      case 0:
        return FAIL;
      case 1:
        return SUCCESS;
      case 2:
        return INVALID_DATA;
      default:
        return null;
    }
  }
}
