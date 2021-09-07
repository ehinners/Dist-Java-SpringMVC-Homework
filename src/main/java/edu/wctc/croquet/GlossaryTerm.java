package edu.wctc.croquet;

import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Complete this class to hold data from croquetGlossary.json
 */
@Data
@NoArgsConstructor
public class GlossaryTerm {
//    "term": "Jammed ball",
//            "definition": "A ball that is found to touch both uprights of a hoop simultaneously on some axis",
//            "regulation": "9.5"
    private String term;
    private String definition;
    private String regulation;
}
