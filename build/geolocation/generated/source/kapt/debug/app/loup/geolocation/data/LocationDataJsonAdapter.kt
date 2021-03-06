// Code generated by moshi-kotlin-codegen. Do not edit.
package app.loup.geolocation.data

import com.squareup.moshi.JsonAdapter
import com.squareup.moshi.JsonReader
import com.squareup.moshi.JsonWriter
import com.squareup.moshi.Moshi
import com.squareup.moshi.internal.Util
import java.lang.NullPointerException
import kotlin.Boolean
import kotlin.Double
import kotlin.String
import kotlin.Suppress
import kotlin.collections.emptySet
import kotlin.text.buildString

@Suppress("DEPRECATION", "unused", "ClassName", "REDUNDANT_PROJECTION")
class LocationDataJsonAdapter(
  moshi: Moshi
) : JsonAdapter<LocationData>() {
  private val options: JsonReader.Options = JsonReader.Options.of("latitude", "longitude",
      "altitude", "isMocked")

  private val doubleAdapter: JsonAdapter<Double> = moshi.adapter(Double::class.java, emptySet(),
      "latitude")

  private val booleanAdapter: JsonAdapter<Boolean> = moshi.adapter(Boolean::class.java, emptySet(),
      "isMocked")

  override fun toString(): String = buildString(34) {
      append("GeneratedJsonAdapter(").append("LocationData").append(')') }

  override fun fromJson(reader: JsonReader): LocationData {
    var latitude: Double? = null
    var longitude: Double? = null
    var altitude: Double? = null
    var isMocked: Boolean? = null
    reader.beginObject()
    while (reader.hasNext()) {
      when (reader.selectName(options)) {
        0 -> latitude = doubleAdapter.fromJson(reader) ?: throw Util.unexpectedNull("latitude",
            "latitude", reader)
        1 -> longitude = doubleAdapter.fromJson(reader) ?: throw Util.unexpectedNull("longitude",
            "longitude", reader)
        2 -> altitude = doubleAdapter.fromJson(reader) ?: throw Util.unexpectedNull("altitude",
            "altitude", reader)
        3 -> isMocked = booleanAdapter.fromJson(reader) ?: throw Util.unexpectedNull("isMocked",
            "isMocked", reader)
        -1 -> {
          // Unknown name, skip it.
          reader.skipName()
          reader.skipValue()
        }
      }
    }
    reader.endObject()
    return LocationData(
        latitude = latitude ?: throw Util.missingProperty("latitude", "latitude", reader),
        longitude = longitude ?: throw Util.missingProperty("longitude", "longitude", reader),
        altitude = altitude ?: throw Util.missingProperty("altitude", "altitude", reader),
        isMocked = isMocked ?: throw Util.missingProperty("isMocked", "isMocked", reader)
    )
  }

  override fun toJson(writer: JsonWriter, value: LocationData?) {
    if (value == null) {
      throw NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.")
    }
    writer.beginObject()
    writer.name("latitude")
    doubleAdapter.toJson(writer, value.latitude)
    writer.name("longitude")
    doubleAdapter.toJson(writer, value.longitude)
    writer.name("altitude")
    doubleAdapter.toJson(writer, value.altitude)
    writer.name("isMocked")
    booleanAdapter.toJson(writer, value.isMocked)
    writer.endObject()
  }
}
