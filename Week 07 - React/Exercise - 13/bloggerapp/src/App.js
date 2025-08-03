import React, { useState } from 'react';
import BookDetails from './components/BookDetails';
import BlogDetails from './components/BlogDetails';
import CourseDetails from './components/CourseDetails';

function App(){
  const [showBooks,setShowBooks]=useState(true);
  const [showBlogs,setShowBlogs]=useState(true);
  const [showCourses,setShowCourses]=useState(true);

  return (
    <div style={{ padding: '30px', fontFamily: 'Arial' }}>
      <h1>Blogger App</h1>

      <div style={{ marginBottom: '15px' }}>
        <button onClick={()=> setShowBooks(prev=>!prev)}>Toggle Books</button> &nbsp;
        <button onClick={()=> setShowBlogs(prev=>!prev)}>Toggle Blogs</button> &nbsp;
        <button onClick={()=> setShowCourses(prev=>!prev)}>Toggle Courses</button>
      </div>

      <BookDetails show={showBooks} />
      <BlogDetails visible={showBlogs} />
      <CourseDetails isVisible={showCourses} />
    </div>
  );
}

export default App;
