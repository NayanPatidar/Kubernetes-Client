package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;
public class V1NetworkPolicySpecBuilder extends io.kubernetes.client.openapi.models.V1NetworkPolicySpecFluentImpl<io.kubernetes.client.openapi.models.V1NetworkPolicySpecBuilder> implements io.kubernetes.client.fluent.VisitableBuilder<io.kubernetes.client.openapi.models.V1NetworkPolicySpec,io.kubernetes.client.openapi.models.V1NetworkPolicySpecBuilder>{
  public V1NetworkPolicySpecBuilder() {
    this(false);
  }
  public V1NetworkPolicySpecBuilder(java.lang.Boolean validationEnabled) {
    this(new V1NetworkPolicySpec(), validationEnabled);
  }
  public V1NetworkPolicySpecBuilder(io.kubernetes.client.openapi.models.V1NetworkPolicySpecFluent<?> fluent) {
    this(fluent, false);
  }
  public V1NetworkPolicySpecBuilder(io.kubernetes.client.openapi.models.V1NetworkPolicySpecFluent<?> fluent,java.lang.Boolean validationEnabled) {
    this(fluent, new V1NetworkPolicySpec(), validationEnabled);
  }
  public V1NetworkPolicySpecBuilder(io.kubernetes.client.openapi.models.V1NetworkPolicySpecFluent<?> fluent,io.kubernetes.client.openapi.models.V1NetworkPolicySpec instance) {
    this(fluent, instance, false);
  }
  public V1NetworkPolicySpecBuilder(io.kubernetes.client.openapi.models.V1NetworkPolicySpecFluent<?> fluent,io.kubernetes.client.openapi.models.V1NetworkPolicySpec instance,java.lang.Boolean validationEnabled) {
    this.fluent = fluent; 
    fluent.withEgress(instance.getEgress());

    fluent.withIngress(instance.getIngress());

    fluent.withPodSelector(instance.getPodSelector());

    fluent.withPolicyTypes(instance.getPolicyTypes());

    this.validationEnabled = validationEnabled; 
  }
  public V1NetworkPolicySpecBuilder(io.kubernetes.client.openapi.models.V1NetworkPolicySpec instance) {
    this(instance,false);
  }
  public V1NetworkPolicySpecBuilder(io.kubernetes.client.openapi.models.V1NetworkPolicySpec instance,java.lang.Boolean validationEnabled) {
    this.fluent = this; 
    this.withEgress(instance.getEgress());

    this.withIngress(instance.getIngress());

    this.withPodSelector(instance.getPodSelector());

    this.withPolicyTypes(instance.getPolicyTypes());

    this.validationEnabled = validationEnabled; 
  }
  io.kubernetes.client.openapi.models.V1NetworkPolicySpecFluent<?> fluent;
  java.lang.Boolean validationEnabled;
  public io.kubernetes.client.openapi.models.V1NetworkPolicySpec build() {
    V1NetworkPolicySpec buildable = new V1NetworkPolicySpec();
    buildable.setEgress(fluent.getEgress());
    buildable.setIngress(fluent.getIngress());
    buildable.setPodSelector(fluent.getPodSelector());
    buildable.setPolicyTypes(fluent.getPolicyTypes());
    return buildable;
  }
  public boolean equals(java.lang.Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    if (!super.equals(o)) return false;
    V1NetworkPolicySpecBuilder that = (V1NetworkPolicySpecBuilder) o;
    if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;

    if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
    return true;
  }
  public int hashCode() {
    return java.util.Objects.hash(fluent,  validationEnabled,  super.hashCode());
  }
  
}