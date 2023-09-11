def consume(json_string):
    if isinstance(json_string, str):
        return "Success!"
    else:
        raise Exception(f'json_string is: {type(json_string)}')

