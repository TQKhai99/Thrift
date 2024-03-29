/**
 * Autogenerated by Thrift Compiler (0.14.2)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.khaitq2.songservice;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.14.2)", date = "2021-08-16")
public class SongResult implements org.apache.thrift.TBase<SongResult, SongResult._Fields>, java.io.Serializable, Cloneable, Comparable<SongResult> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("SongResult");

  private static final org.apache.thrift.protocol.TField ERROR_FIELD_DESC = new org.apache.thrift.protocol.TField("error", org.apache.thrift.protocol.TType.I32, (short)1);
  private static final org.apache.thrift.protocol.TField SONG_FIELD_DESC = new org.apache.thrift.protocol.TField("song", org.apache.thrift.protocol.TType.STRUCT, (short)2);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new SongResultStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new SongResultTupleSchemeFactory();

  public @org.apache.thrift.annotation.Nullable Error error; // required
  public @org.apache.thrift.annotation.Nullable SongStruct song; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    ERROR((short)1, "error"),
    SONG((short)2, "song");

    private static final java.util.Map<java.lang.String, _Fields> byName = new java.util.HashMap<java.lang.String, _Fields>();

    static {
      for (_Fields field : java.util.EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    @org.apache.thrift.annotation.Nullable
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // ERROR
          return ERROR;
        case 2: // SONG
          return SONG;
        default:
          return null;
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, throwing an exception
     * if it is not found.
     */
    public static _Fields findByThriftIdOrThrow(int fieldId) {
      _Fields fields = findByThriftId(fieldId);
      if (fields == null) throw new java.lang.IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    @org.apache.thrift.annotation.Nullable
    public static _Fields findByName(java.lang.String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final java.lang.String _fieldName;

    _Fields(short thriftId, java.lang.String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    public short getThriftFieldId() {
      return _thriftId;
    }

    public java.lang.String getFieldName() {
      return _fieldName;
    }
  }

  // isset id assignments
  private static final _Fields optionals[] = {_Fields.SONG};
  public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.ERROR, new org.apache.thrift.meta_data.FieldMetaData("error", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.ENUM        , "Error")));
    tmpMap.put(_Fields.SONG, new org.apache.thrift.meta_data.FieldMetaData("song", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, SongStruct.class)));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(SongResult.class, metaDataMap);
  }

  public SongResult() {
  }

  public SongResult(
    Error error)
  {
    this();
    this.error = error;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public SongResult(SongResult other) {
    if (other.isSetError()) {
      this.error = other.error;
    }
    if (other.isSetSong()) {
      this.song = new SongStruct(other.song);
    }
  }

  public SongResult deepCopy() {
    return new SongResult(this);
  }

  @Override
  public void clear() {
    this.error = null;
    this.song = null;
  }

  @org.apache.thrift.annotation.Nullable
  public Error getError() {
    return this.error;
  }

  public SongResult setError(@org.apache.thrift.annotation.Nullable Error error) {
    this.error = error;
    return this;
  }

  public void unsetError() {
    this.error = null;
  }

  /** Returns true if field error is set (has been assigned a value) and false otherwise */
  public boolean isSetError() {
    return this.error != null;
  }

  public void setErrorIsSet(boolean value) {
    if (!value) {
      this.error = null;
    }
  }

  @org.apache.thrift.annotation.Nullable
  public SongStruct getSong() {
    return this.song;
  }

  public SongResult setSong(@org.apache.thrift.annotation.Nullable SongStruct song) {
    this.song = song;
    return this;
  }

  public void unsetSong() {
    this.song = null;
  }

  /** Returns true if field song is set (has been assigned a value) and false otherwise */
  public boolean isSetSong() {
    return this.song != null;
  }

  public void setSongIsSet(boolean value) {
    if (!value) {
      this.song = null;
    }
  }

  public void setFieldValue(_Fields field, @org.apache.thrift.annotation.Nullable java.lang.Object value) {
    switch (field) {
    case ERROR:
      if (value == null) {
        unsetError();
      } else {
        setError((Error)value);
      }
      break;

    case SONG:
      if (value == null) {
        unsetSong();
      } else {
        setSong((SongStruct)value);
      }
      break;

    }
  }

  @org.apache.thrift.annotation.Nullable
  public java.lang.Object getFieldValue(_Fields field) {
    switch (field) {
    case ERROR:
      return getError();

    case SONG:
      return getSong();

    }
    throw new java.lang.IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new java.lang.IllegalArgumentException();
    }

    switch (field) {
    case ERROR:
      return isSetError();
    case SONG:
      return isSetSong();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that instanceof SongResult)
      return this.equals((SongResult)that);
    return false;
  }

  public boolean equals(SongResult that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_error = true && this.isSetError();
    boolean that_present_error = true && that.isSetError();
    if (this_present_error || that_present_error) {
      if (!(this_present_error && that_present_error))
        return false;
      if (!this.error.equals(that.error))
        return false;
    }

    boolean this_present_song = true && this.isSetSong();
    boolean that_present_song = true && that.isSetSong();
    if (this_present_song || that_present_song) {
      if (!(this_present_song && that_present_song))
        return false;
      if (!this.song.equals(that.song))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + ((isSetError()) ? 131071 : 524287);
    if (isSetError())
      hashCode = hashCode * 8191 + error.getValue();

    hashCode = hashCode * 8191 + ((isSetSong()) ? 131071 : 524287);
    if (isSetSong())
      hashCode = hashCode * 8191 + song.hashCode();

    return hashCode;
  }

  @Override
  public int compareTo(SongResult other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = java.lang.Boolean.compare(isSetError(), other.isSetError());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetError()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.error, other.error);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.compare(isSetSong(), other.isSetSong());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetSong()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.song, other.song);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  @org.apache.thrift.annotation.Nullable
  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }

  public void read(org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
    scheme(iprot).read(iprot, this);
  }

  public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    scheme(oprot).write(oprot, this);
  }

  @Override
  public java.lang.String toString() {
    java.lang.StringBuilder sb = new java.lang.StringBuilder("SongResult(");
    boolean first = true;

    sb.append("error:");
    if (this.error == null) {
      sb.append("null");
    } else {
      sb.append(this.error);
    }
    first = false;
    if (isSetSong()) {
      if (!first) sb.append(", ");
      sb.append("song:");
      if (this.song == null) {
        sb.append("null");
      } else {
        sb.append(this.song);
      }
      first = false;
    }
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    if (error == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'error' was not present! Struct: " + toString());
    }
    // check for sub-struct validity
    if (song != null) {
      song.validate();
    }
  }

  private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
    try {
      write(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(out)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, java.lang.ClassNotFoundException {
    try {
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class SongResultStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public SongResultStandardScheme getScheme() {
      return new SongResultStandardScheme();
    }
  }

  private static class SongResultStandardScheme extends org.apache.thrift.scheme.StandardScheme<SongResult> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, SongResult struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // ERROR
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.error = com.khaitq2.songservice.Error.findByValue(iprot.readI32());
              struct.setErrorIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // SONG
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.song = new SongStruct();
              struct.song.read(iprot);
              struct.setSongIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          default:
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
        }
        iprot.readFieldEnd();
      }
      iprot.readStructEnd();

      // check for required fields of primitive type, which can't be checked in the validate method
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, SongResult struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.error != null) {
        oprot.writeFieldBegin(ERROR_FIELD_DESC);
        oprot.writeI32(struct.error.getValue());
        oprot.writeFieldEnd();
      }
      if (struct.song != null) {
        if (struct.isSetSong()) {
          oprot.writeFieldBegin(SONG_FIELD_DESC);
          struct.song.write(oprot);
          oprot.writeFieldEnd();
        }
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class SongResultTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public SongResultTupleScheme getScheme() {
      return new SongResultTupleScheme();
    }
  }

  private static class SongResultTupleScheme extends org.apache.thrift.scheme.TupleScheme<SongResult> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, SongResult struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      oprot.writeI32(struct.error.getValue());
      java.util.BitSet optionals = new java.util.BitSet();
      if (struct.isSetSong()) {
        optionals.set(0);
      }
      oprot.writeBitSet(optionals, 1);
      if (struct.isSetSong()) {
        struct.song.write(oprot);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, SongResult struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      struct.error = com.khaitq2.songservice.Error.findByValue(iprot.readI32());
      struct.setErrorIsSet(true);
      java.util.BitSet incoming = iprot.readBitSet(1);
      if (incoming.get(0)) {
        struct.song = new SongStruct();
        struct.song.read(iprot);
        struct.setSongIsSet(true);
      }
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}

