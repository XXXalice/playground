from models.models import PostContent
from flask import Flask
from flask import render_template, request, url_for, jsonify
from flask_sockets import Sockets

app = Flask(__name__)
app.config['JSON_AS_ASCII'] = False

@app.route('/')
def index():
    return render_template('index.html')

@app.route('/posts', methods=['GET'])
def view_posts():
    posts_dict = {}
    posts = PostContent.query.all()
    for post in posts:
        posts_dict['id'] = str(post.id)
        posts_dict[str(post.id)] = {
            'title': post.title,
            'body': post.body,
            'date': post.time
        }
    return jsonify(posts_dict)


if __name__ == '__main__':
    app.run(debug=True)