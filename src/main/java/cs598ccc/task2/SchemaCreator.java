package cs598ccc.task2;

import org.apache.spark.sql.types.DataTypes;
import org.apache.spark.sql.types.StructField;
import org.apache.spark.sql.types.StructType;

public class SchemaCreator {


    public static StructType createSchema(){
        StructType mySchema = DataTypes.createStructType(new StructField[]{ //#A
                DataTypes.createStructField(
                        "Month", //#B
                        DataTypes.IntegerType, //#C
                        true), //#D
                DataTypes.createStructField(
                        "DayofMonth",
                        DataTypes.IntegerType,
                        true),
                DataTypes.createStructField(
                        "DayOfWeek",
                        DataTypes.IntegerType,
                        true),
                DataTypes.createStructField(
                        "FlightDate",
                        DataTypes.DateType,
                        true),
                DataTypes.createStructField(
                        "AirlineID",
                        DataTypes.StringType,
                        true),
                DataTypes.createStructField(
                        "Carrier",
                        DataTypes.StringType,
                        true),
                DataTypes.createStructField(
                        "FlightNum",
                        DataTypes.StringType,
                        true),
                DataTypes.createStructField(
                        "Origin",
                        DataTypes.StringType,
                        true),
                DataTypes.createStructField(
                        "Dest",
                        DataTypes.StringType,
                        true),
                DataTypes.createStructField(
                        "CRSDepTime",
                        DataTypes.IntegerType,
                        true),
                DataTypes.createStructField(
                        "DepTime",
                        DataTypes.IntegerType,
                        true),
                DataTypes.createStructField(
                        "DepDelay",
                        DataTypes.createDecimalType(10,2),
                        true),
                DataTypes.createStructField(
                        "DepDelayMinutes",
                        DataTypes.createDecimalType(10,2),
                        true),
                DataTypes.createStructField(
                        "DepDel15",
                        DataTypes.IntegerType,
                        true),
                DataTypes.createStructField(
                        "TaxiOut",
                        DataTypes.createDecimalType(10,2),
                        true),
                DataTypes.createStructField(
                        "WheelsOff",
                        DataTypes.IntegerType,
                        true),
                DataTypes.createStructField(
                        "WheelsOn",
                        DataTypes.IntegerType,
                        true),
                DataTypes.createStructField(
                        "TaxiIn",
                        DataTypes.createDecimalType(10,2),
                        true),
                DataTypes.createStructField(
                        "CRSArrTime",
                        DataTypes.IntegerType,
                        true),
                DataTypes.createStructField(
                        "ArrTime",
                        DataTypes.IntegerType,
                        true),
                DataTypes.createStructField(
                        "ArrDelay",
                        DataTypes.createDecimalType(10,2),
                        true),
                DataTypes.createStructField(
                        "ArrDelayMinutes",
                        DataTypes.createDecimalType(10,2),
                        true),
                DataTypes.createStructField(
                        "ArrDel15",
                        DataTypes.IntegerType,
                        true),
                DataTypes.createStructField(
                        "Cancelled",
                        DataTypes.IntegerType,
                        true),
                DataTypes.createStructField(
                        "Diverted",
                        DataTypes.IntegerType,
                        true),
                DataTypes.createStructField(
                        "ActualElapsedTime",
                        DataTypes.createDecimalType(10,2),
                        true),
                DataTypes.createStructField(
                        "AirTime",
                        DataTypes.StringType,
                        true),
                DataTypes.createStructField(
                        "Distance",
                        DataTypes.createDecimalType(10,2),
                        true),
                DataTypes.createStructField(
                        "departure",
                        DataTypes.IntegerType,
                        true),
                DataTypes.createStructField(
                        "arrival",
                        DataTypes.IntegerType,
                        true),
                DataTypes.createStructField(
                        "origin_airport_code",
                        DataTypes.StringType,
                        true),
                DataTypes.createStructField(
                        "departureDelay",
                        DataTypes.createDecimalType(14,6),
                        true),
                DataTypes.createStructField(
                        "lon_origin",
                        DataTypes.createDecimalType(10,2),
                        true),
                DataTypes.createStructField(
                        "lat_origin",
                        DataTypes.createDecimalType(10,2),
                        true),
                DataTypes.createStructField(
                        "dest_airport_code",
                        DataTypes.StringType,
                        true),
                DataTypes.createStructField(
                        "arrivalDelay",
                        DataTypes.createDecimalType(14,6),
                        true),
                DataTypes.createStructField(
                        "lon_dest",
                        DataTypes.createDecimalType(10,2),
                        true),
                DataTypes.createStructField(
                        "lat_dest",
                        DataTypes.createDecimalType(10,2),
                        true),
                DataTypes.createStructField(
                        "Year",
                        DataTypes.IntegerType,
                        false)});
        return mySchema;
    }

    public static StructType createSchemaWithId(){
        StructType mySchema = DataTypes.createStructType(new StructField[]{ //#A
                DataTypes.createStructField(
                        "Month", //#B
                        DataTypes.IntegerType, //#C
                        true), //#D
                DataTypes.createStructField(
                        "DayofMonth",
                        DataTypes.IntegerType,
                        true),
                DataTypes.createStructField(
                        "DayOfWeek",
                        DataTypes.IntegerType,
                        true),
                DataTypes.createStructField(
                        "FlightDate",
                        DataTypes.DateType,
                        true),
                DataTypes.createStructField(
                        "AirlineID",
                        DataTypes.StringType,
                        true),
                DataTypes.createStructField(
                        "Carrier",
                        DataTypes.StringType,
                        true),
                DataTypes.createStructField(
                        "FlightNum",
                        DataTypes.StringType,
                        true),
                DataTypes.createStructField(
                        "Origin",
                        DataTypes.StringType,
                        true),
                DataTypes.createStructField(
                        "Dest",
                        DataTypes.StringType,
                        true),
                DataTypes.createStructField(
                        "CRSDepTime",
                        DataTypes.IntegerType,
                        true),
                DataTypes.createStructField(
                        "DepTime",
                        DataTypes.IntegerType,
                        true),
                DataTypes.createStructField(
                        "DepDelay",
                        DataTypes.createDecimalType(10,2),
                        true),
                DataTypes.createStructField(
                        "DepDelayMinutes",
                        DataTypes.createDecimalType(10,2),
                        true),
                DataTypes.createStructField(
                        "DepDel15",
                        DataTypes.IntegerType,
                        true),
                DataTypes.createStructField(
                        "TaxiOut",
                        DataTypes.createDecimalType(10,2),
                        true),
                DataTypes.createStructField(
                        "WheelsOff",
                        DataTypes.IntegerType,
                        true),
                DataTypes.createStructField(
                        "WheelsOn",
                        DataTypes.IntegerType,
                        true),
                DataTypes.createStructField(
                        "TaxiIn",
                        DataTypes.createDecimalType(10,2),
                        true),
                DataTypes.createStructField(
                        "CRSArrTime",
                        DataTypes.IntegerType,
                        true),
                DataTypes.createStructField(
                        "ArrTime",
                        DataTypes.IntegerType,
                        true),
                DataTypes.createStructField(
                        "ArrDelay",
                        DataTypes.createDecimalType(10,2),
                        true),
                DataTypes.createStructField(
                        "ArrDelayMinutes",
                        DataTypes.createDecimalType(10,2),
                        true),
                DataTypes.createStructField(
                        "ArrDel15",
                        DataTypes.IntegerType,
                        true),
                DataTypes.createStructField(
                        "Cancelled",
                        DataTypes.IntegerType,
                        true),
                DataTypes.createStructField(
                        "Diverted",
                        DataTypes.IntegerType,
                        true),
                DataTypes.createStructField(
                        "ActualElapsedTime",
                        DataTypes.createDecimalType(10,2),
                        true),
                DataTypes.createStructField(
                        "AirTime",
                        DataTypes.StringType,
                        true),
                DataTypes.createStructField(
                        "Distance",
                        DataTypes.createDecimalType(10,2),
                        true),
                DataTypes.createStructField(
                        "departure",
                        DataTypes.IntegerType,
                        true),
                DataTypes.createStructField(
                        "arrival",
                        DataTypes.IntegerType,
                        true),
                DataTypes.createStructField(
                        "origin_airport_code",
                        DataTypes.StringType,
                        true),
                DataTypes.createStructField(
                        "departureDelay",
                        DataTypes.createDecimalType(14,6),
                        true),
                DataTypes.createStructField(
                        "lon_origin",
                        DataTypes.createDecimalType(10,2),
                        true),
                DataTypes.createStructField(
                        "lat_origin",
                        DataTypes.createDecimalType(10,2),
                        true),
                DataTypes.createStructField(
                        "dest_airport_code",
                        DataTypes.StringType,
                        true),
                DataTypes.createStructField(
                        "arrivalDelay",
                        DataTypes.createDecimalType(14,6),
                        true),
                DataTypes.createStructField(
                        "lon_dest",
                        DataTypes.createDecimalType(10,2),
                        true),
                DataTypes.createStructField(
                        "lat_dest",
                        DataTypes.createDecimalType(10,2),
                        true),
                DataTypes.createStructField(
                        "Year",
                        DataTypes.IntegerType,
                        true),
                DataTypes.createStructField(
                        "id",
                        DataTypes.LongType,
                        false)
        });

        return mySchema;


    }

    public static StructType createQuery1dot1Schema(){
        StructType mySchema = DataTypes.createStructType(new StructField[]{ //#A
                DataTypes.createStructField(
                        "origin",
                        DataTypes.StringType,
                        true),
                DataTypes.createStructField(
                        "totalArrivalsAndDepartures",
                        DataTypes.IntegerType,
                        false)

        });

        return mySchema;

    }


    public static StructType createQuery1dot2Schema(){
        StructType mySchema = DataTypes.createStructType(new StructField[]{ //#A
                DataTypes.createStructField(
                        "group",
                        DataTypes.IntegerType,
                        false),
                DataTypes.createStructField(
                        "Carrier",
                        DataTypes.StringType,
                        true),
                DataTypes.createStructField(
                        "avg_time_added",
                        DataTypes.createDecimalType(14,6),
                        false)

        });

        return mySchema;

    }



    public static void main(String[] args){
        System.out.println(SchemaCreator.createSchema());
        System.out.println(SchemaCreator.createSchemaWithId());
        System.out.println(SchemaCreator.createQuery1dot1Schema());
        System.out.println(SchemaCreator.createQuery1dot2Schema());
    }

}

