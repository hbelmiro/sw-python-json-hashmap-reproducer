import json


def create():
    plain_json = {
        "name": "Helber",
        "company": "Red Hat"
    }

    json_string = json.dumps(plain_json)

    return json_string
