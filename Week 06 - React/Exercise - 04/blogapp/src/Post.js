import React from 'react';

class Post{
  constructor(id,title,body){
    this.id=id;
    this.title=title;
    this.body=body;
  }
}

class Posts extends React.Component{
  constructor(props){
    super(props);
    this.state={
      posts:[],
      hasError: false,
    };
  }

  loadPosts=async()=>{
    try {
      const response=await fetch("https://jsonplaceholder.typicode.com/posts");
      const data=await response.json();
      const postObjects=data.map(p => new Post(p.id,p.title,p.body));
      this.setState({posts:postObjects });
    } catch (error) {
      console.error("Error fetching posts:", error);
      this.setState({hasError:true });
    }
  };

  componentDidMount(){
    this.loadPosts();
  }

  componentDidCatch(error,info) {
    alert("Something went wrong in the Posts component.");
    console.error("Error:",error, info);
    this.setState({ hasError:true });
  }

  render(){
    if (this.state.hasError){
      return <h2>Failed to load posts.</h2>;
    }

    return (
      <div>
        <h2>List of Blog Posts</h2>
        {this.state.posts.map(post=>(
          <div key={post.id} >
            <h3>{post.title}</h3>
            <p>{post.body}</p>
          </div>
        ))}
      </div>
    );
  }
}

export { Post };
export default Posts;
