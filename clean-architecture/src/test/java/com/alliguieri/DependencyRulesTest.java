package com.alliguieri;

import com.tngtech.archunit.core.importer.ClassFileImporter;
import static com.tngtech.archunit.lang.syntax.ArchRuleDefinition.noClasses;

import org.junit.jupiter.api.Test;

public class DependencyRulesTest {
    @Test
    void domainShouldNotDependOnApplicationLayer() {
        noClasses()
            .that()
            .resideInAPackage("..domain..")
            .should()
            .dependOnClassesThat()
            .resideInAnyPackage("..application..")
            .check(new ClassFileImporter().importPackages("com.alliguieri"));

    }
}
