
from flask import Flask


from transformers import pipeline

app = Flask(__name__)
app.debug = True


generator = pipeline('text-generation', model='EleutherAI/gpt-neo-125M')
#prompt = 'The thing I hate most' # can be anything

@app.route("/sentence/<name>")
def homepage(name):
  res = generator(name, max_length=50, do_sample=True, temperature=0.9)
  message2 = "The model predicted" + str(res)
  return message2

app.run(host = "0.0.0.0")




