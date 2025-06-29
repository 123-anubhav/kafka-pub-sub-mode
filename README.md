# kafka-pub-sub-model

````markdown
# 🚀 Kafka Topic Management Guide

This guide provides essential Kafka CLI commands for managing topics in a local Kafka setup.

---

## 🛠️ Create a Kafka Topic

Create a Kafka topic named `anubhav_orders_topic` with the following configuration:
- **Partitions**: 1
- **Replication Factor**: 1

### 🔧 Command:
```bash
kafka-topics.bat --create ^
  --bootstrap-server localhost:9092 ^
  --replication-factor 1 ^
  --partitions 1 ^
  --topic anubhav_orders_topic
````

---

## 📜 List All Kafka Topics

To view all available topics on your Kafka server:

### 📄 Command:

```bash
kafka-topics.bat --list --bootstrap-server localhost:9092
```

---

## 🔍 Describe a Topic

To get details about a specific topic (e.g., partitions, replicas):

### 🧾 Command:

```bash
kafka-topics.bat --describe --bootstrap-server localhost:9092 --topic anubhav_orders_topic
```

---

## 🧹 Delete a Kafka Topic (if enabled)

To delete a topic (only if delete is enabled in Kafka config):

### ❌ Command:

```bash
kafka-topics.bat --delete --bootstrap-server localhost:9092 --topic anubhav_orders_topic
```

---

## ✅ Requirements

* Kafka must be running locally on `localhost:9092`
* Zookeeper must be running (if using older Kafka versions)
* Environment variables for Kafka bin path should be set or you should run the command from the Kafka `bin/windows` directory

---

## 📦 Kafka Utilities (Optional)

* Produce messages:

  ```bash
  kafka-console-producer.bat --broker-list localhost:9092 --topic anubhav_orders_topic
  ```

* Consume messages:

  ```bash
  kafka-console-consumer.bat --bootstrap-server localhost:9092 --topic anubhav_orders_topic --from-beginning
  ```

---

```
```

kafka pub-sub model-example

![Kafka Debug](https://github.com/123-anubhav/kafka-pub-sub-mode/blob/main/kafkaDebug.bmp?raw=true)
