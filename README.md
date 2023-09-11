# sw-python-json-hashmap-reproducer

This is a reproducer for [an issue](https://issues.redhat.com/browse/KOGITO-9797).

To reproduce it, run:

```bash
mvn verify
```

Tests should pass, but instead, it throws:

```bash
jep.JepException: <class 'Exception'>: json_string is: <class 'java.util.HashMap'>
		at /home/hbelmiro/dev/hbelmiro/sw-python-json-hashmap-reproducer/sw-python-json-hashmap-reproducer/./python/consume_json.consume(consume_json.py:5)
```
