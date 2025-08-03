import React from 'react';

const blogs=[
  { title:'React Hooks Deep Dive',views:3500 },
  { title:'Mastering Redux',views:1200 },
  { title:'State vs Props',views:1800 },
];

const BlogDetails=({visible})=>(
  <>
    {visible && ( 
      <div>
        <h2>Blog Details</h2>
        <ul>
          {blogs.map((blog, idx)=>(
            <li key={idx}>
              {blog.title} - {blog.views} views
            </li>
          ))}
        </ul>
      </div>
    )}
  </>
);

export default BlogDetails;
