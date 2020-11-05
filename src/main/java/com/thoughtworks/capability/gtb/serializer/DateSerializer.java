package com.thoughtworks.capability.gtb.serializer;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;

import java.io.IOException;
import java.util.Date;

public class DateSerializer extends StdSerializer<Date> {
  public DateSerializer() {
    super(Date.class);
  }

  @Override
  public void serialize(Date value, JsonGenerator gen, SerializerProvider provider) throws IOException {
    gen.writeNumber(value.getTime());
  }
}
