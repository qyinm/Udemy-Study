import React from "react";
import { CORE_CONCEPTS } from '../data.js';
import CoreConcept from "./CoreConcept.jsx";

export default function CoreConcepts() {
  return (
    <section id="core-concepts">
      <h2>Core Concepts</h2>
      <ul>
        {CORE_CONCEPTS.map((conceptItem) => (
          <CoreConcept
            key={conceptItem.title}
            // title={core.title}
            // description={core.description}
            // image={core.image}
            {...conceptItem}
          />
        ))}
      </ul>
    </section>
  );
}
