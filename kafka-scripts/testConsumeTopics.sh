cd ~/opensource/apache/kafka_2.11-1.0.0/bin
./kafka-console-consumer.sh --bootstrap-server localhost:9092 --from-beginning  --topic enriched-cleansed-data-multipart
./kafka-console-consumer.sh --bootstrap-server localhost:9092 --from-beginning  --topic query1dot1-multipart
./kafka-console-consumer.sh --bootstrap-server localhost:9092 --from-beginning  --topic query1dot2-multipart
./kafka-console-consumer.sh --bootstrap-server localhost:9092 --from-beginning  --topic query2dot1-multipart


