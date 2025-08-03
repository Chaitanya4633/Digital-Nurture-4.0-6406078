import React from 'react';

const courses=[
  { name:'Full Stack Web Development',enrolled:true },
  { name:'Data Structures & Algorithms',enrolled:false },
  { name:'Machine Learning Basics',enrolled:true },
];

const CourseDetails=({isVisible})=>{
  return isVisible ? ( 
    <div>
      <h2>Course Details</h2>
      <ul>
        {courses.map((course,idx)=>(
          <li key={idx}>
            {course.name}-{course.enrolled ? 'Enrolled':'Not Enrolled'}
          </li>
        ))}
      </ul>
    </div>
  ) : null;
};

export default CourseDetails;
