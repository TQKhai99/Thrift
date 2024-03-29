/**
 * Autogenerated by Thrift Compiler (0.14.2)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.khaitq2.songservice;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.14.2)", date = "2021-08-16")
public class SongStruct implements org.apache.thrift.TBase<SongStruct, SongStruct._Fields>, java.io.Serializable, Cloneable, Comparable<SongStruct> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("SongStruct");

  private static final org.apache.thrift.protocol.TField ID_FIELD_DESC = new org.apache.thrift.protocol.TField("id", org.apache.thrift.protocol.TType.I32, (short)1);
  private static final org.apache.thrift.protocol.TField TITLE_FIELD_DESC = new org.apache.thrift.protocol.TField("title", org.apache.thrift.protocol.TType.STRING, (short)2);
  private static final org.apache.thrift.protocol.TField SINGERS_FIELD_DESC = new org.apache.thrift.protocol.TField("singers", org.apache.thrift.protocol.TType.LIST, (short)3);
  private static final org.apache.thrift.protocol.TField STREAM_FIELD_DESC = new org.apache.thrift.protocol.TField("stream", org.apache.thrift.protocol.TType.I32, (short)4);
  private static final org.apache.thrift.protocol.TField LIKE_FIELD_DESC = new org.apache.thrift.protocol.TField("like", org.apache.thrift.protocol.TType.I32, (short)5);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new SongStructStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new SongStructTupleSchemeFactory();

  public int id; // required
  public @org.apache.thrift.annotation.Nullable java.lang.String title; // required
  public @org.apache.thrift.annotation.Nullable java.util.List<java.lang.String> singers; // required
  public int stream; // required
  public int like; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    ID((short)1, "id"),
    TITLE((short)2, "title"),
    SINGERS((short)3, "singers"),
    STREAM((short)4, "stream"),
    LIKE((short)5, "like");

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
        case 1: // ID
          return ID;
        case 2: // TITLE
          return TITLE;
        case 3: // SINGERS
          return SINGERS;
        case 4: // STREAM
          return STREAM;
        case 5: // LIKE
          return LIKE;
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
  private static final int __ID_ISSET_ID = 0;
  private static final int __STREAM_ISSET_ID = 1;
  private static final int __LIKE_ISSET_ID = 2;
  private byte __isset_bitfield = 0;
  public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.ID, new org.apache.thrift.meta_data.FieldMetaData("id", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields.TITLE, new org.apache.thrift.meta_data.FieldMetaData("title", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.SINGERS, new org.apache.thrift.meta_data.FieldMetaData("singers", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING))));
    tmpMap.put(_Fields.STREAM, new org.apache.thrift.meta_data.FieldMetaData("stream", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields.LIKE, new org.apache.thrift.meta_data.FieldMetaData("like", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(SongStruct.class, metaDataMap);
  }

  public SongStruct() {
    this.stream = 0;

    this.like = 0;

  }

  public SongStruct(
    int id,
    java.lang.String title,
    java.util.List<java.lang.String> singers,
    int stream,
    int like)
  {
    this();
    this.id = id;
    setIdIsSet(true);
    this.title = title;
    this.singers = singers;
    this.stream = stream;
    setStreamIsSet(true);
    this.like = like;
    setLikeIsSet(true);
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public SongStruct(SongStruct other) {
    __isset_bitfield = other.__isset_bitfield;
    this.id = other.id;
    if (other.isSetTitle()) {
      this.title = other.title;
    }
    if (other.isSetSingers()) {
      java.util.List<java.lang.String> __this__singers = new java.util.ArrayList<java.lang.String>(other.singers);
      this.singers = __this__singers;
    }
    this.stream = other.stream;
    this.like = other.like;
  }

  public SongStruct deepCopy() {
    return new SongStruct(this);
  }

  @Override
  public void clear() {
    setIdIsSet(false);
    this.id = 0;
    this.title = null;
    this.singers = null;
    this.stream = 0;

    this.like = 0;

  }

  public int getId() {
    return this.id;
  }

  public SongStruct setId(int id) {
    this.id = id;
    setIdIsSet(true);
    return this;
  }

  public void unsetId() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __ID_ISSET_ID);
  }

  /** Returns true if field id is set (has been assigned a value) and false otherwise */
  public boolean isSetId() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __ID_ISSET_ID);
  }

  public void setIdIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __ID_ISSET_ID, value);
  }

  @org.apache.thrift.annotation.Nullable
  public java.lang.String getTitle() {
    return this.title;
  }

  public SongStruct setTitle(@org.apache.thrift.annotation.Nullable java.lang.String title) {
    this.title = title;
    return this;
  }

  public void unsetTitle() {
    this.title = null;
  }

  /** Returns true if field title is set (has been assigned a value) and false otherwise */
  public boolean isSetTitle() {
    return this.title != null;
  }

  public void setTitleIsSet(boolean value) {
    if (!value) {
      this.title = null;
    }
  }

  public int getSingersSize() {
    return (this.singers == null) ? 0 : this.singers.size();
  }

  @org.apache.thrift.annotation.Nullable
  public java.util.Iterator<java.lang.String> getSingersIterator() {
    return (this.singers == null) ? null : this.singers.iterator();
  }

  public void addToSingers(java.lang.String elem) {
    if (this.singers == null) {
      this.singers = new java.util.ArrayList<java.lang.String>();
    }
    this.singers.add(elem);
  }

  @org.apache.thrift.annotation.Nullable
  public java.util.List<java.lang.String> getSingers() {
    return this.singers;
  }

  public SongStruct setSingers(@org.apache.thrift.annotation.Nullable java.util.List<java.lang.String> singers) {
    this.singers = singers;
    return this;
  }

  public void unsetSingers() {
    this.singers = null;
  }

  /** Returns true if field singers is set (has been assigned a value) and false otherwise */
  public boolean isSetSingers() {
    return this.singers != null;
  }

  public void setSingersIsSet(boolean value) {
    if (!value) {
      this.singers = null;
    }
  }

  public int getStream() {
    return this.stream;
  }

  public SongStruct setStream(int stream) {
    this.stream = stream;
    setStreamIsSet(true);
    return this;
  }

  public void unsetStream() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __STREAM_ISSET_ID);
  }

  /** Returns true if field stream is set (has been assigned a value) and false otherwise */
  public boolean isSetStream() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __STREAM_ISSET_ID);
  }

  public void setStreamIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __STREAM_ISSET_ID, value);
  }

  public int getLike() {
    return this.like;
  }

  public SongStruct setLike(int like) {
    this.like = like;
    setLikeIsSet(true);
    return this;
  }

  public void unsetLike() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __LIKE_ISSET_ID);
  }

  /** Returns true if field like is set (has been assigned a value) and false otherwise */
  public boolean isSetLike() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __LIKE_ISSET_ID);
  }

  public void setLikeIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __LIKE_ISSET_ID, value);
  }

  public void setFieldValue(_Fields field, @org.apache.thrift.annotation.Nullable java.lang.Object value) {
    switch (field) {
    case ID:
      if (value == null) {
        unsetId();
      } else {
        setId((java.lang.Integer)value);
      }
      break;

    case TITLE:
      if (value == null) {
        unsetTitle();
      } else {
        setTitle((java.lang.String)value);
      }
      break;

    case SINGERS:
      if (value == null) {
        unsetSingers();
      } else {
        setSingers((java.util.List<java.lang.String>)value);
      }
      break;

    case STREAM:
      if (value == null) {
        unsetStream();
      } else {
        setStream((java.lang.Integer)value);
      }
      break;

    case LIKE:
      if (value == null) {
        unsetLike();
      } else {
        setLike((java.lang.Integer)value);
      }
      break;

    }
  }

  @org.apache.thrift.annotation.Nullable
  public java.lang.Object getFieldValue(_Fields field) {
    switch (field) {
    case ID:
      return getId();

    case TITLE:
      return getTitle();

    case SINGERS:
      return getSingers();

    case STREAM:
      return getStream();

    case LIKE:
      return getLike();

    }
    throw new java.lang.IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new java.lang.IllegalArgumentException();
    }

    switch (field) {
    case ID:
      return isSetId();
    case TITLE:
      return isSetTitle();
    case SINGERS:
      return isSetSingers();
    case STREAM:
      return isSetStream();
    case LIKE:
      return isSetLike();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that instanceof SongStruct)
      return this.equals((SongStruct)that);
    return false;
  }

  public boolean equals(SongStruct that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_id = true;
    boolean that_present_id = true;
    if (this_present_id || that_present_id) {
      if (!(this_present_id && that_present_id))
        return false;
      if (this.id != that.id)
        return false;
    }

    boolean this_present_title = true && this.isSetTitle();
    boolean that_present_title = true && that.isSetTitle();
    if (this_present_title || that_present_title) {
      if (!(this_present_title && that_present_title))
        return false;
      if (!this.title.equals(that.title))
        return false;
    }

    boolean this_present_singers = true && this.isSetSingers();
    boolean that_present_singers = true && that.isSetSingers();
    if (this_present_singers || that_present_singers) {
      if (!(this_present_singers && that_present_singers))
        return false;
      if (!this.singers.equals(that.singers))
        return false;
    }

    boolean this_present_stream = true;
    boolean that_present_stream = true;
    if (this_present_stream || that_present_stream) {
      if (!(this_present_stream && that_present_stream))
        return false;
      if (this.stream != that.stream)
        return false;
    }

    boolean this_present_like = true;
    boolean that_present_like = true;
    if (this_present_like || that_present_like) {
      if (!(this_present_like && that_present_like))
        return false;
      if (this.like != that.like)
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + id;

    hashCode = hashCode * 8191 + ((isSetTitle()) ? 131071 : 524287);
    if (isSetTitle())
      hashCode = hashCode * 8191 + title.hashCode();

    hashCode = hashCode * 8191 + ((isSetSingers()) ? 131071 : 524287);
    if (isSetSingers())
      hashCode = hashCode * 8191 + singers.hashCode();

    hashCode = hashCode * 8191 + stream;

    hashCode = hashCode * 8191 + like;

    return hashCode;
  }

  @Override
  public int compareTo(SongStruct other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = java.lang.Boolean.compare(isSetId(), other.isSetId());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetId()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.id, other.id);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.compare(isSetTitle(), other.isSetTitle());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetTitle()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.title, other.title);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.compare(isSetSingers(), other.isSetSingers());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetSingers()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.singers, other.singers);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.compare(isSetStream(), other.isSetStream());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetStream()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.stream, other.stream);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.compare(isSetLike(), other.isSetLike());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetLike()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.like, other.like);
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
    java.lang.StringBuilder sb = new java.lang.StringBuilder("SongStruct(");
    boolean first = true;

    sb.append("id:");
    sb.append(this.id);
    first = false;
    if (!first) sb.append(", ");
    sb.append("title:");
    if (this.title == null) {
      sb.append("null");
    } else {
      sb.append(this.title);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("singers:");
    if (this.singers == null) {
      sb.append("null");
    } else {
      sb.append(this.singers);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("stream:");
    sb.append(this.stream);
    first = false;
    if (!first) sb.append(", ");
    sb.append("like:");
    sb.append(this.like);
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    // check for sub-struct validity
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
      // it doesn't seem like you should have to do this, but java serialization is wacky, and doesn't call the default constructor.
      __isset_bitfield = 0;
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class SongStructStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public SongStructStandardScheme getScheme() {
      return new SongStructStandardScheme();
    }
  }

  private static class SongStructStandardScheme extends org.apache.thrift.scheme.StandardScheme<SongStruct> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, SongStruct struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // ID
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.id = iprot.readI32();
              struct.setIdIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // TITLE
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.title = iprot.readString();
              struct.setTitleIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // SINGERS
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list0 = iprot.readListBegin();
                struct.singers = new java.util.ArrayList<java.lang.String>(_list0.size);
                @org.apache.thrift.annotation.Nullable java.lang.String _elem1;
                for (int _i2 = 0; _i2 < _list0.size; ++_i2)
                {
                  _elem1 = iprot.readString();
                  struct.singers.add(_elem1);
                }
                iprot.readListEnd();
              }
              struct.setSingersIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // STREAM
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.stream = iprot.readI32();
              struct.setStreamIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 5: // LIKE
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.like = iprot.readI32();
              struct.setLikeIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, SongStruct struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      oprot.writeFieldBegin(ID_FIELD_DESC);
      oprot.writeI32(struct.id);
      oprot.writeFieldEnd();
      if (struct.title != null) {
        oprot.writeFieldBegin(TITLE_FIELD_DESC);
        oprot.writeString(struct.title);
        oprot.writeFieldEnd();
      }
      if (struct.singers != null) {
        oprot.writeFieldBegin(SINGERS_FIELD_DESC);
        {
          oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRING, struct.singers.size()));
          for (java.lang.String _iter3 : struct.singers)
          {
            oprot.writeString(_iter3);
          }
          oprot.writeListEnd();
        }
        oprot.writeFieldEnd();
      }
      oprot.writeFieldBegin(STREAM_FIELD_DESC);
      oprot.writeI32(struct.stream);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(LIKE_FIELD_DESC);
      oprot.writeI32(struct.like);
      oprot.writeFieldEnd();
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class SongStructTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public SongStructTupleScheme getScheme() {
      return new SongStructTupleScheme();
    }
  }

  private static class SongStructTupleScheme extends org.apache.thrift.scheme.TupleScheme<SongStruct> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, SongStruct struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet optionals = new java.util.BitSet();
      if (struct.isSetId()) {
        optionals.set(0);
      }
      if (struct.isSetTitle()) {
        optionals.set(1);
      }
      if (struct.isSetSingers()) {
        optionals.set(2);
      }
      if (struct.isSetStream()) {
        optionals.set(3);
      }
      if (struct.isSetLike()) {
        optionals.set(4);
      }
      oprot.writeBitSet(optionals, 5);
      if (struct.isSetId()) {
        oprot.writeI32(struct.id);
      }
      if (struct.isSetTitle()) {
        oprot.writeString(struct.title);
      }
      if (struct.isSetSingers()) {
        {
          oprot.writeI32(struct.singers.size());
          for (java.lang.String _iter4 : struct.singers)
          {
            oprot.writeString(_iter4);
          }
        }
      }
      if (struct.isSetStream()) {
        oprot.writeI32(struct.stream);
      }
      if (struct.isSetLike()) {
        oprot.writeI32(struct.like);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, SongStruct struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet incoming = iprot.readBitSet(5);
      if (incoming.get(0)) {
        struct.id = iprot.readI32();
        struct.setIdIsSet(true);
      }
      if (incoming.get(1)) {
        struct.title = iprot.readString();
        struct.setTitleIsSet(true);
      }
      if (incoming.get(2)) {
        {
          org.apache.thrift.protocol.TList _list5 = iprot.readListBegin(org.apache.thrift.protocol.TType.STRING);
          struct.singers = new java.util.ArrayList<java.lang.String>(_list5.size);
          @org.apache.thrift.annotation.Nullable java.lang.String _elem6;
          for (int _i7 = 0; _i7 < _list5.size; ++_i7)
          {
            _elem6 = iprot.readString();
            struct.singers.add(_elem6);
          }
        }
        struct.setSingersIsSet(true);
      }
      if (incoming.get(3)) {
        struct.stream = iprot.readI32();
        struct.setStreamIsSet(true);
      }
      if (incoming.get(4)) {
        struct.like = iprot.readI32();
        struct.setLikeIsSet(true);
      }
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}

