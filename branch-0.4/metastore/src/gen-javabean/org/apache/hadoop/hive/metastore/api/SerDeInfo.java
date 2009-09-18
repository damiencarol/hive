/**
 * Autogenerated by Thrift
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 */
package org.apache.hadoop.hive.metastore.api;

import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.Set;
import java.util.HashSet;
import java.util.Collections;
import org.apache.log4j.Logger;

import org.apache.thrift.*;
import org.apache.thrift.meta_data.*;
import org.apache.thrift.protocol.*;

public class SerDeInfo implements TBase, java.io.Serializable, Cloneable {
  private static final TStruct STRUCT_DESC = new TStruct("SerDeInfo");
  private static final TField NAME_FIELD_DESC = new TField("name", TType.STRING, (short)1);
  private static final TField SERIALIZATION_LIB_FIELD_DESC = new TField("serializationLib", TType.STRING, (short)2);
  private static final TField PARAMETERS_FIELD_DESC = new TField("parameters", TType.MAP, (short)3);

  private String name;
  public static final int NAME = 1;
  private String serializationLib;
  public static final int SERIALIZATIONLIB = 2;
  private Map<String,String> parameters;
  public static final int PARAMETERS = 3;

  private final Isset __isset = new Isset();
  private static final class Isset implements java.io.Serializable {
  }

  public static final Map<Integer, FieldMetaData> metaDataMap = Collections.unmodifiableMap(new HashMap<Integer, FieldMetaData>() {{
    put(NAME, new FieldMetaData("name", TFieldRequirementType.DEFAULT, 
        new FieldValueMetaData(TType.STRING)));
    put(SERIALIZATIONLIB, new FieldMetaData("serializationLib", TFieldRequirementType.DEFAULT, 
        new FieldValueMetaData(TType.STRING)));
    put(PARAMETERS, new FieldMetaData("parameters", TFieldRequirementType.DEFAULT, 
        new MapMetaData(TType.MAP, 
            new FieldValueMetaData(TType.STRING), 
            new FieldValueMetaData(TType.STRING))));
  }});

  static {
    FieldMetaData.addStructMetaDataMap(SerDeInfo.class, metaDataMap);
  }

  public SerDeInfo() {
  }

  public SerDeInfo(
    String name,
    String serializationLib,
    Map<String,String> parameters)
  {
    this();
    this.name = name;
    this.serializationLib = serializationLib;
    this.parameters = parameters;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public SerDeInfo(SerDeInfo other) {
    if (other.isSetName()) {
      this.name = other.name;
    }
    if (other.isSetSerializationLib()) {
      this.serializationLib = other.serializationLib;
    }
    if (other.isSetParameters()) {
      Map<String,String> __this__parameters = new HashMap<String,String>();
      for (Map.Entry<String, String> other_element : other.parameters.entrySet()) {

        String other_element_key = other_element.getKey();
        String other_element_value = other_element.getValue();

        String __this__parameters_copy_key = other_element_key;

        String __this__parameters_copy_value = other_element_value;

        __this__parameters.put(__this__parameters_copy_key, __this__parameters_copy_value);
      }
      this.parameters = __this__parameters;
    }
  }

  @Override
  public SerDeInfo clone() {
    return new SerDeInfo(this);
  }

  public String getName() {
    return this.name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void unsetName() {
    this.name = null;
  }

  // Returns true if field name is set (has been asigned a value) and false otherwise
  public boolean isSetName() {
    return this.name != null;
  }

  public String getSerializationLib() {
    return this.serializationLib;
  }

  public void setSerializationLib(String serializationLib) {
    this.serializationLib = serializationLib;
  }

  public void unsetSerializationLib() {
    this.serializationLib = null;
  }

  // Returns true if field serializationLib is set (has been asigned a value) and false otherwise
  public boolean isSetSerializationLib() {
    return this.serializationLib != null;
  }

  public int getParametersSize() {
    return (this.parameters == null) ? 0 : this.parameters.size();
  }

  public void putToParameters(String key, String val) {
    if (this.parameters == null) {
      this.parameters = new HashMap<String,String>();
    }
    this.parameters.put(key, val);
  }

  public Map<String,String> getParameters() {
    return this.parameters;
  }

  public void setParameters(Map<String,String> parameters) {
    this.parameters = parameters;
  }

  public void unsetParameters() {
    this.parameters = null;
  }

  // Returns true if field parameters is set (has been asigned a value) and false otherwise
  public boolean isSetParameters() {
    return this.parameters != null;
  }

  public void setFieldValue(int fieldID, Object value) {
    switch (fieldID) {
    case NAME:
      if (value == null) {
        unsetName();
      } else {
        setName((String)value);
      }
      break;

    case SERIALIZATIONLIB:
      if (value == null) {
        unsetSerializationLib();
      } else {
        setSerializationLib((String)value);
      }
      break;

    case PARAMETERS:
      if (value == null) {
        unsetParameters();
      } else {
        setParameters((Map<String,String>)value);
      }
      break;

    default:
      throw new IllegalArgumentException("Field " + fieldID + " doesn't exist!");
    }
  }

  public Object getFieldValue(int fieldID) {
    switch (fieldID) {
    case NAME:
      return getName();

    case SERIALIZATIONLIB:
      return getSerializationLib();

    case PARAMETERS:
      return getParameters();

    default:
      throw new IllegalArgumentException("Field " + fieldID + " doesn't exist!");
    }
  }

  // Returns true if field corresponding to fieldID is set (has been asigned a value) and false otherwise
  public boolean isSet(int fieldID) {
    switch (fieldID) {
    case NAME:
      return isSetName();
    case SERIALIZATIONLIB:
      return isSetSerializationLib();
    case PARAMETERS:
      return isSetParameters();
    default:
      throw new IllegalArgumentException("Field " + fieldID + " doesn't exist!");
    }
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof SerDeInfo)
      return this.equals((SerDeInfo)that);
    return false;
  }

  public boolean equals(SerDeInfo that) {
    if (that == null)
      return false;

    boolean this_present_name = true && this.isSetName();
    boolean that_present_name = true && that.isSetName();
    if (this_present_name || that_present_name) {
      if (!(this_present_name && that_present_name))
        return false;
      if (!this.name.equals(that.name))
        return false;
    }

    boolean this_present_serializationLib = true && this.isSetSerializationLib();
    boolean that_present_serializationLib = true && that.isSetSerializationLib();
    if (this_present_serializationLib || that_present_serializationLib) {
      if (!(this_present_serializationLib && that_present_serializationLib))
        return false;
      if (!this.serializationLib.equals(that.serializationLib))
        return false;
    }

    boolean this_present_parameters = true && this.isSetParameters();
    boolean that_present_parameters = true && that.isSetParameters();
    if (this_present_parameters || that_present_parameters) {
      if (!(this_present_parameters && that_present_parameters))
        return false;
      if (!this.parameters.equals(that.parameters))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    return 0;
  }

  public void read(TProtocol iprot) throws TException {
    TField field;
    iprot.readStructBegin();
    while (true)
    {
      field = iprot.readFieldBegin();
      if (field.type == TType.STOP) { 
        break;
      }
      switch (field.id)
      {
        case NAME:
          if (field.type == TType.STRING) {
            this.name = iprot.readString();
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case SERIALIZATIONLIB:
          if (field.type == TType.STRING) {
            this.serializationLib = iprot.readString();
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case PARAMETERS:
          if (field.type == TType.MAP) {
            {
              TMap _map4 = iprot.readMapBegin();
              this.parameters = new HashMap<String,String>(2*_map4.size);
              for (int _i5 = 0; _i5 < _map4.size; ++_i5)
              {
                String _key6;
                String _val7;
                _key6 = iprot.readString();
                _val7 = iprot.readString();
                this.parameters.put(_key6, _val7);
              }
              iprot.readMapEnd();
            }
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        default:
          TProtocolUtil.skip(iprot, field.type);
          break;
      }
      iprot.readFieldEnd();
    }
    iprot.readStructEnd();

    validate();
  }

  public void write(TProtocol oprot) throws TException {
    validate();

    oprot.writeStructBegin(STRUCT_DESC);
    if (this.name != null) {
      oprot.writeFieldBegin(NAME_FIELD_DESC);
      oprot.writeString(this.name);
      oprot.writeFieldEnd();
    }
    if (this.serializationLib != null) {
      oprot.writeFieldBegin(SERIALIZATION_LIB_FIELD_DESC);
      oprot.writeString(this.serializationLib);
      oprot.writeFieldEnd();
    }
    if (this.parameters != null) {
      oprot.writeFieldBegin(PARAMETERS_FIELD_DESC);
      {
        oprot.writeMapBegin(new TMap(TType.STRING, TType.STRING, this.parameters.size()));
        for (Map.Entry<String, String> _iter8 : this.parameters.entrySet())        {
          oprot.writeString(_iter8.getKey());
          oprot.writeString(_iter8.getValue());
        }
        oprot.writeMapEnd();
      }
      oprot.writeFieldEnd();
    }
    oprot.writeFieldStop();
    oprot.writeStructEnd();
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("SerDeInfo(");
    boolean first = true;

    sb.append("name:");
    if (this.name == null) {
      sb.append("null");
    } else {
      sb.append(this.name);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("serializationLib:");
    if (this.serializationLib == null) {
      sb.append("null");
    } else {
      sb.append(this.serializationLib);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("parameters:");
    if (this.parameters == null) {
      sb.append("null");
    } else {
      sb.append(this.parameters);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws TException {
    // check for required fields
    // check that fields of type enum have valid values
  }

}

