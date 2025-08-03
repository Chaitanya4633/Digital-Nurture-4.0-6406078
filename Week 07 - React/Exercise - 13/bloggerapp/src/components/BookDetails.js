import React from 'react';

const books=[
  { title:'Atomic Habits', author:'James Clear' },
  { title:'Deep Work', author:'Cal Newport' },
  { title:'The Alchemist', author:'Paulo Coelho' },
];

const BookDetails=({show})=>{
  if (!show) return null; 

  return (
    <div>
      <h2>Book Details</h2>
      <ul>
        {books.map((book,idx)=>(
          <li key={idx}>
            <strong>{book.title}</strong> by {book.author}
          </li>
        ))}
      </ul>
    </div>
  );
};

export default BookDetails;
