/**
 * Autogenerated by Thrift Compiler (0.14.2)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.14.2)", date = "2021-08-05")
public class SongResult implements org.apache.thrift.TBase<SongResult, SongResult._Fields>, java.io.Serializable, Cloneable, Comparable<SongResult> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("SongResult");

  private static final org.apache.thrift.protocol.TField ERROR_FIELD_DESC = new org.apache.thrift.protocol.TField("error", org.apache.thrift.protocol.TType.I32, (short)1);
  private static final org.apache.thrift.protocol.TField SONG_FIELD_DESC = new org.apache.thrift.protocol.TField("song", org.apache.thrift.protocol.TType.STRUCT, (short)2);
  private static final org.apache.thrift.protocol.TField LISTSONG_FIELD_DESC = new org.apache.thrift.protocol.TField("listsong", org.apache.thrift.protocol.TType.LIST, (short)3);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new SongResultStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new SongResultTupleSchemeFactory();

  public int error; // required
  public @org.apache.thrift.annotation.Nullable SongStruct song; // optional
  public @org.apache.thrift.annotation.Nullable java.util.List<java.lang.Integer> listsong; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    ERROR((short)1, "error"),
    SONG((short)2, "song"),
    LISTSONG((short)3, "listsong");

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
        case 3: // LISTSONG
          return LISTSONG;
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
  private static final int __ERROR_ISSET_ID = 0;
  private byte __isset_bitfield = 0;
  private static final _Fields optionals[] = {_Fields.SONG,_Fields.LISTSONG};
  public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.ERROR, new org.apache.thrift.meta_data.FieldMetaData("error", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields.SONG, new org.apache.thrift.meta_data.FieldMetaData("song", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, SongStruct.class)));
    tmpMap.put(_Fields.LISTSONG, new org.apache.thrift.meta_data.FieldMetaData("listsong", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32))));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(SongResult.class, metaDataMap);
  }

  public SongResult() {
  }

  public SongResult(
    int error)
  {
    this();
    this.error = error;
    setErrorIsSet(true);
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public SongResult(SongResult other) {
    __isset_bitfield = other.__isset_bitfield;
    this.error = other.error;
    if (other.isSetSong()) {
      this.song = new SongStruct(other.song);
    }
    if (other.isSetListsong()) {
      java.util.List<java.lang.Integer> __this__listsong = new java.util.ArrayList<java.lang.Integer>(other.listsong);
      this.listsong = __this__listsong;
    }
  }

  public SongResult deepCopy() {
    return new SongResult(this);
  }

  @Override
  public void clear() {
    setErrorIsSet(false);
    this.error = 0;
    this.song = null;
    this.listsong = null;
  }

  public int getError() {
    return this.error;
  }

  public SongResult setError(int error) {
    this.error = error;
    setErrorIsSet(true);
    return this;
  }

  public void unsetError() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __ERROR_ISSET_ID);
  }

  /** Returns true if field error is set (has been assigned a value) and false otherwise */
  public boolean isSetError() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __ERROR_ISSET_ID);
  }

  public void setErrorIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __ERROR_ISSET_ID, value);
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

  public int getListsongSize() {
    return (this.listsong == null) ? 0 : this.listsong.size();
  }

  @org.apache.thrift.annotation.Nullable
  public java.util.Iterator<java.lang.Integer> getListsongIterator() {
    return (this.listsong == null) ? null : this.listsong.iterator();
  }

  public void addToListsong(int elem) {
    if (this.listsong == null) {
      this.listsong = new java.util.ArrayList<java.lang.Integer>();
    }
    this.listsong.add(elem);
  }

  @org.apache.thrift.annotation.Nullable
  public java.util.List<java.lang.Integer> getListsong() {
    return this.listsong;
  }

  public SongResult setListsong(@org.apache.thrift.annotation.Nullable java.util.List<java.lang.Integer> listsong) {
    this.listsong = listsong;
    return this;
  }

  public void unsetListsong() {
    this.listsong = null;
  }

  /** Returns true if field listsong is set (has been assigned a value) and false otherwise */
  public boolean isSetListsong() {
    return this.listsong != null;
  }

  public void setListsongIsSet(boolean value) {
    if (!value) {
      this.listsong = null;
    }
  }

  public void setFieldValue(_Fields field, @org.apache.thrift.annotation.Nullable java.lang.Object value) {
    switch (field) {
    case ERROR:
      if (value == null) {
        unsetError();
      } else {
        setError((java.lang.Integer)value);
      }
      break;

    case SONG:
      if (value == null) {
        unsetSong();
      } else {
        setSong((SongStruct)value);
      }
      break;

    case LISTSONG:
      if (value == null) {
        unsetListsong();
      } else {
        setListsong((java.util.List<java.lang.Integer>)value);
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

    case LISTSONG:
      return getListsong();

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
    case LISTSONG:
      return isSetListsong();
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

    boolean this_present_error = true;
    boolean that_present_error = true;
    if (this_present_error || that_present_error) {
      if (!(this_present_error && that_present_error))
        return false;
      if (this.error != that.error)
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

    boolean this_present_listsong = true && this.isSetListsong();
    boolean that_present_listsong = true && that.isSetListsong();
    if (this_present_listsong || that_present_listsong) {
      if (!(this_present_listsong && that_present_listsong))
        return false;
      if (!this.listsong.equals(that.listsong))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + error;

    hashCode = hashCode * 8191 + ((isSetSong()) ? 131071 : 524287);
    if (isSetSong())
      hashCode = hashCode * 8191 + song.hashCode();

    hashCode = hashCode * 8191 + ((isSetListsong()) ? 131071 : 524287);
    if (isSetListsong())
      hashCode = hashCode * 8191 + listsong.hashCode();

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
    lastComparison = java.lang.Boolean.compare(isSetListsong(), other.isSetListsong());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetListsong()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.listsong, other.listsong);
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
    sb.append(this.error);
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
    if (isSetListsong()) {
      if (!first) sb.append(", ");
      sb.append("listsong:");
      if (this.listsong == null) {
        sb.append("null");
      } else {
        sb.append(this.listsong);
      }
      first = false;
    }
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    // alas, we cannot check 'error' because it's a primitive and you chose the non-beans generator.
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
      // it doesn't seem like you should have to do this, but java serialization is wacky, and doesn't call the default constructor.
      __isset_bitfield = 0;
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
              struct.error = iprot.readI32();
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
          case 3: // LISTSONG
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list8 = iprot.readListBegin();
                struct.listsong = new java.util.ArrayList<java.lang.Integer>(_list8.size);
                int _elem9;
                for (int _i10 = 0; _i10 < _list8.size; ++_i10)
                {
                  _elem9 = iprot.readI32();
                  struct.listsong.add(_elem9);
                }
                iprot.readListEnd();
              }
              struct.setListsongIsSet(true);
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
      if (!struct.isSetError()) {
        throw new org.apache.thrift.protocol.TProtocolException("Required field 'error' was not found in serialized data! Struct: " + toString());
      }
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, SongResult struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      oprot.writeFieldBegin(ERROR_FIELD_DESC);
      oprot.writeI32(struct.error);
      oprot.writeFieldEnd();
      if (struct.song != null) {
        if (struct.isSetSong()) {
          oprot.writeFieldBegin(SONG_FIELD_DESC);
          struct.song.write(oprot);
          oprot.writeFieldEnd();
        }
      }
      if (struct.listsong != null) {
        if (struct.isSetListsong()) {
          oprot.writeFieldBegin(LISTSONG_FIELD_DESC);
          {
            oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.I32, struct.listsong.size()));
            for (int _iter11 : struct.listsong)
            {
              oprot.writeI32(_iter11);
            }
            oprot.writeListEnd();
          }
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
      oprot.writeI32(struct.error);
      java.util.BitSet optionals = new java.util.BitSet();
      if (struct.isSetSong()) {
        optionals.set(0);
      }
      if (struct.isSetListsong()) {
        optionals.set(1);
      }
      oprot.writeBitSet(optionals, 2);
      if (struct.isSetSong()) {
        struct.song.write(oprot);
      }
      if (struct.isSetListsong()) {
        {
          oprot.writeI32(struct.listsong.size());
          for (int _iter12 : struct.listsong)
          {
            oprot.writeI32(_iter12);
          }
        }
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, SongResult struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      struct.error = iprot.readI32();
      struct.setErrorIsSet(true);
      java.util.BitSet incoming = iprot.readBitSet(2);
      if (incoming.get(0)) {
        struct.song = new SongStruct();
        struct.song.read(iprot);
        struct.setSongIsSet(true);
      }
      if (incoming.get(1)) {
        {
          org.apache.thrift.protocol.TList _list13 = iprot.readListBegin(org.apache.thrift.protocol.TType.I32);
          struct.listsong = new java.util.ArrayList<java.lang.Integer>(_list13.size);
          int _elem14;
          for (int _i15 = 0; _i15 < _list13.size; ++_i15)
          {
            _elem14 = iprot.readI32();
            struct.listsong.add(_elem14);
          }
        }
        struct.setListsongIsSet(true);
      }
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}

