import React from "react";

export default function GameOver({ winner, onRestart }) {
  console.log(1);
  return (
    <div id="game-over">
      <h2>Game Over!</h2>
      {winner && <p>{winner} won!</p>}
      {!winner && <p>It's draw</p>}
      <p>
        <button onClick={onRestart}>rematch!</button>
      </p>
    </div>
  );
}
