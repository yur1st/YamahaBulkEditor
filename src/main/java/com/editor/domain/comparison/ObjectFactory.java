
package com.editor.domain.comparison;

import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each
 * Java content interface and Java element interface
 * generated in the mypackage package.
 * <p>An ObjectFactory allows you to programatically
 * construct new instances of the Java representation
 * for XML content. The Java representation of XML
 * content can consist of schema derived interfaces
 * and classes representing the binding of schema
 * type definitions, element declarations and model
 * groups.  Factory methods for each of these are
 * provided in this class.
 */
@XmlRegistry
public class ObjectFactory {


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: mypackage
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Specifications }
     */
    public Specifications createSpecifications() {
        return new Specifications();
    }

    /**
     * Create an instance of {@link Specifications.Spec }
     */
    public Specifications.Spec createSpecificationsSpec() {
        return new Specifications.Spec();
    }

    /**
     * Create an instance of {@link Specifications.Spec.Programs }
     */
    public Specifications.Spec.Programs createSpecificationsSpecPrograms() {
        return new Specifications.Spec.Programs();
    }

    /**
     * Create an instance of {@link Specifications.Spec.Programs.Program }
     */
    public Specifications.Spec.Programs.Program createSpecificationsSpecProgramsProgram() {
        return new Specifications.Spec.Programs.Program();
    }

    /**
     * Create an instance of {@link Specifications.Spec.Programs.Program.Parts }
     */
    public Specifications.Spec.Programs.Program.Parts createSpecificationsSpecProgramsProgramParts() {
        return new Specifications.Spec.Programs.Program.Parts();
    }

    /**
     * Create an instance of {@link Specifications.Spec.AddedParts }
     */
    public Specifications.Spec.AddedParts createSpecificationsSpecAddedParts() {
        return new Specifications.Spec.AddedParts();
    }

    /**
     * Create an instance of {@link Specifications.Spec.Programs.Program.Parts.Part }
     */
    public Specifications.Spec.Programs.Program.Parts.Part createSpecificationsSpecProgramsProgramPartsPart() {
        return new Specifications.Spec.Programs.Program.Parts.Part();
    }

    /**
     * Create an instance of {@link Specifications.Spec.AddedParts.Part }
     */
    public Specifications.Spec.AddedParts.Part createSpecificationsSpecAddedPartsPart() {
        return new Specifications.Spec.AddedParts.Part();
    }

}
