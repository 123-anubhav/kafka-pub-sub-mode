# kafka-pub-sub-mode
kafka pub-sub model-example
# 📘 Kafka CLI Commands Cheat Sheet

## 🔧 Create a Kafka Topic

To create a topic named `anubhav_orders_topic` with 1 partition and replication factor of 1:

```bash
kafka-topics.bat --create \
  --bootstrap-server localhost:9092 \
  --replication-factor 1 \
  --partitions 1 \
  --topic anubhav_orders_topic

![Kafka Debug](https://github.com/123-anubhav/kafka-pub-sub-mode/blob/main/kafkaDebug.bmp?raw=true)
