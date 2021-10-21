package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;
public class V1NodeSelectorRequirementBuilder extends io.kubernetes.client.openapi.models.V1NodeSelectorRequirementFluentImpl<io.kubernetes.client.openapi.models.V1NodeSelectorRequirementBuilder> implements io.kubernetes.client.fluent.VisitableBuilder<io.kubernetes.client.openapi.models.V1NodeSelectorRequirement,io.kubernetes.client.openapi.models.V1NodeSelectorRequirementBuilder>{
  public V1NodeSelectorRequirementBuilder() {
    this(false);
  }
  public V1NodeSelectorRequirementBuilder(java.lang.Boolean validationEnabled) {
    this(new V1NodeSelectorRequirement(), validationEnabled);
  }
  public V1NodeSelectorRequirementBuilder(io.kubernetes.client.openapi.models.V1NodeSelectorRequirementFluent<?> fluent) {
    this(fluent, false);
  }
  public V1NodeSelectorRequirementBuilder(io.kubernetes.client.openapi.models.V1NodeSelectorRequirementFluent<?> fluent,java.lang.Boolean validationEnabled) {
    this(fluent, new V1NodeSelectorRequirement(), validationEnabled);
  }
  public V1NodeSelectorRequirementBuilder(io.kubernetes.client.openapi.models.V1NodeSelectorRequirementFluent<?> fluent,io.kubernetes.client.openapi.models.V1NodeSelectorRequirement instance) {
    this(fluent, instance, false);
  }
  public V1NodeSelectorRequirementBuilder(io.kubernetes.client.openapi.models.V1NodeSelectorRequirementFluent<?> fluent,io.kubernetes.client.openapi.models.V1NodeSelectorRequirement instance,java.lang.Boolean validationEnabled) {
    this.fluent = fluent; 
    fluent.withKey(instance.getKey());

    fluent.withOperator(instance.getOperator());

    fluent.withValues(instance.getValues());

    this.validationEnabled = validationEnabled; 
  }
  public V1NodeSelectorRequirementBuilder(io.kubernetes.client.openapi.models.V1NodeSelectorRequirement instance) {
    this(instance,false);
  }
  public V1NodeSelectorRequirementBuilder(io.kubernetes.client.openapi.models.V1NodeSelectorRequirement instance,java.lang.Boolean validationEnabled) {
    this.fluent = this; 
    this.withKey(instance.getKey());

    this.withOperator(instance.getOperator());

    this.withValues(instance.getValues());

    this.validationEnabled = validationEnabled; 
  }
  io.kubernetes.client.openapi.models.V1NodeSelectorRequirementFluent<?> fluent;
  java.lang.Boolean validationEnabled;
  public io.kubernetes.client.openapi.models.V1NodeSelectorRequirement build() {
    V1NodeSelectorRequirement buildable = new V1NodeSelectorRequirement();
    buildable.setKey(fluent.getKey());
    buildable.setOperator(fluent.getOperator());
    buildable.setValues(fluent.getValues());
    return buildable;
  }
  public boolean equals(java.lang.Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    if (!super.equals(o)) return false;
    V1NodeSelectorRequirementBuilder that = (V1NodeSelectorRequirementBuilder) o;
    if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;

    if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
    return true;
  }
  public int hashCode() {
    return java.util.Objects.hash(fluent,  validationEnabled,  super.hashCode());
  }
  
}