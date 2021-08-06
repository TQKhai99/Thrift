/**
 * Autogenerated by Thrift Compiler (0.14.2)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.14.2)", date = "2021-08-06")
public class ListSongResult implements org.apache.thrift.TBase<ListSongResult, ListSongResult._Fields>, java.io.Serializable, Cloneable, Comparable<ListSongResult> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("ListSongResult");

  private static final org.apache.thrift.protocol.TField ERROR_FIELD_DESC = new org.apache.thrift.protocol.TField("error", org.apache.thrift.protocol.TType.I32, (short)1);
  private static final org.apache.thrift.protocol.TField LIST_SONG_FIELD_DESC = new org.apache.thrift.protocol.TField("listSong", org.apache.thrift.protocol.TType.LIST, (short)2);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new ListSongResultStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new ListSongResultTupleSchemeFactory();

  public @org.apache.thrift.annotation.Nullable Error error; // required
  public @org.apache.thrift.annotation.Nullable java.util.List<java.lang.Integer> listSong; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    ERROR((short)1, "error"),
    LIST_SONG((short)2, "listSong");

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
        case 2: // LIST_SONG
          return LIST_SONG;
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
  private static final _Fields optionals[] = {_Fields.LIST_SONG};
  public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.ERROR, new org.apache.thrift.meta_data.FieldMetaData("error", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.ENUM        , "Error")));
    tmpMap.put(_Fields.LIST_SONG, new org.apache.thrift.meta_data.FieldMetaData("listSong", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32))));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(ListSongResult.class, metaDataMap);
  }

  public ListSongResult() {
  }

  public ListSongResult(
    Error error)
  {
    this();
    this.error = error;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public ListSongResult(ListSongResult other) {
    if (other.isSetError()) {
      this.error = other.error;
    }
    if (other.isSetListSong()) {
      java.util.List<java.lang.Integer> __this__listSong = new java.util.ArrayList<java.lang.Integer>(other.listSong);
      this.listSong = __this__listSong;
    }
  }

  public ListSongResult deepCopy() {
    return new ListSongResult(this);
  }

  @Override
  public void clear() {
    this.error = null;
    this.listSong = null;
  }

  @org.apache.thrift.annotation.Nullable
  public Error getError() {
    return this.error;
  }

  public ListSongResult setError(@org.apache.thrift.annotation.Nullable Error error) {
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

  public int getListSongSize() {
    return (this.listSong == null) ? 0 : this.listSong.size();
  }

  @org.apache.thrift.annotation.Nullable
  public java.util.Iterator<java.lang.Integer> getListSongIterator() {
    return (this.listSong == null) ? null : this.listSong.iterator();
  }

  public void addToListSong(int elem) {
    if (this.listSong == null) {
      this.listSong = new java.util.ArrayList<java.lang.Integer>();
    }
    this.listSong.add(elem);
  }

  @org.apache.thrift.annotation.Nullable
  public java.util.List<java.lang.Integer> getListSong() {
    return this.listSong;
  }

  public ListSongResult setListSong(@org.apache.thrift.annotation.Nullable java.util.List<java.lang.Integer> listSong) {
    this.listSong = listSong;
    return this;
  }

  public void unsetListSong() {
    this.listSong = null;
  }

  /** Returns true if field listSong is set (has been assigned a value) and false otherwise */
  public boolean isSetListSong() {
    return this.listSong != null;
  }

  public void setListSongIsSet(boolean value) {
    if (!value) {
      this.listSong = null;
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

    case LIST_SONG:
      if (value == null) {
        unsetListSong();
      } else {
        setListSong((java.util.List<java.lang.Integer>)value);
      }
      break;

    }
  }

  @org.apache.thrift.annotation.Nullable
  public java.lang.Object getFieldValue(_Fields field) {
    switch (field) {
    case ERROR:
      return getError();

    case LIST_SONG:
      return getListSong();

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
    case LIST_SONG:
      return isSetListSong();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that instanceof ListSongResult)
      return this.equals((ListSongResult)that);
    return false;
  }

  public boolean equals(ListSongResult that) {
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

    boolean this_present_listSong = true && this.isSetListSong();
    boolean that_present_listSong = true && that.isSetListSong();
    if (this_present_listSong || that_present_listSong) {
      if (!(this_present_listSong && that_present_listSong))
        return false;
      if (!this.listSong.equals(that.listSong))
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

    hashCode = hashCode * 8191 + ((isSetListSong()) ? 131071 : 524287);
    if (isSetListSong())
      hashCode = hashCode * 8191 + listSong.hashCode();

    return hashCode;
  }

  @Override
  public int compareTo(ListSongResult other) {
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
    lastComparison = java.lang.Boolean.compare(isSetListSong(), other.isSetListSong());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetListSong()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.listSong, other.listSong);
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
    java.lang.StringBuilder sb = new java.lang.StringBuilder("ListSongResult(");
    boolean first = true;

    sb.append("error:");
    if (this.error == null) {
      sb.append("null");
    } else {
      sb.append(this.error);
    }
    first = false;
    if (isSetListSong()) {
      if (!first) sb.append(", ");
      sb.append("listSong:");
      if (this.listSong == null) {
        sb.append("null");
      } else {
        sb.append(this.listSong);
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

  private static class ListSongResultStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public ListSongResultStandardScheme getScheme() {
      return new ListSongResultStandardScheme();
    }
  }

  private static class ListSongResultStandardScheme extends org.apache.thrift.scheme.StandardScheme<ListSongResult> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, ListSongResult struct) throws org.apache.thrift.TException {
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
              struct.error = Error.findByValue(iprot.readI32());
              struct.setErrorIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // LIST_SONG
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list8 = iprot.readListBegin();
                struct.listSong = new java.util.ArrayList<java.lang.Integer>(_list8.size);
                int _elem9;
                for (int _i10 = 0; _i10 < _list8.size; ++_i10)
                {
                  _elem9 = iprot.readI32();
                  struct.listSong.add(_elem9);
                }
                iprot.readListEnd();
              }
              struct.setListSongIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, ListSongResult struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.error != null) {
        oprot.writeFieldBegin(ERROR_FIELD_DESC);
        oprot.writeI32(struct.error.getValue());
        oprot.writeFieldEnd();
      }
      if (struct.listSong != null) {
        if (struct.isSetListSong()) {
          oprot.writeFieldBegin(LIST_SONG_FIELD_DESC);
          {
            oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.I32, struct.listSong.size()));
            for (int _iter11 : struct.listSong)
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

  private static class ListSongResultTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public ListSongResultTupleScheme getScheme() {
      return new ListSongResultTupleScheme();
    }
  }

  private static class ListSongResultTupleScheme extends org.apache.thrift.scheme.TupleScheme<ListSongResult> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, ListSongResult struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      oprot.writeI32(struct.error.getValue());
      java.util.BitSet optionals = new java.util.BitSet();
      if (struct.isSetListSong()) {
        optionals.set(0);
      }
      oprot.writeBitSet(optionals, 1);
      if (struct.isSetListSong()) {
        {
          oprot.writeI32(struct.listSong.size());
          for (int _iter12 : struct.listSong)
          {
            oprot.writeI32(_iter12);
          }
        }
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, ListSongResult struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      struct.error = Error.findByValue(iprot.readI32());
      struct.setErrorIsSet(true);
      java.util.BitSet incoming = iprot.readBitSet(1);
      if (incoming.get(0)) {
        {
          org.apache.thrift.protocol.TList _list13 = iprot.readListBegin(org.apache.thrift.protocol.TType.I32);
          struct.listSong = new java.util.ArrayList<java.lang.Integer>(_list13.size);
          int _elem14;
          for (int _i15 = 0; _i15 < _list13.size; ++_i15)
          {
            _elem14 = iprot.readI32();
            struct.listSong.add(_elem14);
          }
        }
        struct.setListSongIsSet(true);
      }
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}

