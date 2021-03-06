package edu.berkeley.ground.api.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import edu.berkeley.ground.api.versions.Type;
import edu.berkeley.ground.api.versions.Version;

import java.util.*;

public class StructureVersion extends Version {
    // the id of the Structure containing this Version
    private String structureId;

    // the map of attribute names to types
    private Map<String, Type> attributes;

    @JsonCreator
    protected StructureVersion(@JsonProperty("id") String id,
                               @JsonProperty("structureId") String structureId,
                               @JsonProperty("attributes") Map<String, Type> attributes) {
        super(id);

        this.structureId = structureId;
        this.attributes = attributes;
    }

    @JsonProperty
    public String getStructureId() {
        return this.structureId;
    }

    @JsonProperty
    public Map<String, Type> getAttributes() {
        return this.attributes;
    }

}
