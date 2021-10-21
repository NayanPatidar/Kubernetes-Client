package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;
public class V2beta1HorizontalPodAutoscalerBuilder extends io.kubernetes.client.openapi.models.V2beta1HorizontalPodAutoscalerFluentImpl<io.kubernetes.client.openapi.models.V2beta1HorizontalPodAutoscalerBuilder> implements io.kubernetes.client.fluent.VisitableBuilder<io.kubernetes.client.openapi.models.V2beta1HorizontalPodAutoscaler,io.kubernetes.client.openapi.models.V2beta1HorizontalPodAutoscalerBuilder>{
  public V2beta1HorizontalPodAutoscalerBuilder() {
    this(false);
  }
  public V2beta1HorizontalPodAutoscalerBuilder(java.lang.Boolean validationEnabled) {
    this(new V2beta1HorizontalPodAutoscaler(), validationEnabled);
  }
  public V2beta1HorizontalPodAutoscalerBuilder(io.kubernetes.client.openapi.models.V2beta1HorizontalPodAutoscalerFluent<?> fluent) {
    this(fluent, false);
  }
  public V2beta1HorizontalPodAutoscalerBuilder(io.kubernetes.client.openapi.models.V2beta1HorizontalPodAutoscalerFluent<?> fluent,java.lang.Boolean validationEnabled) {
    this(fluent, new V2beta1HorizontalPodAutoscaler(), validationEnabled);
  }
  public V2beta1HorizontalPodAutoscalerBuilder(io.kubernetes.client.openapi.models.V2beta1HorizontalPodAutoscalerFluent<?> fluent,io.kubernetes.client.openapi.models.V2beta1HorizontalPodAutoscaler instance) {
    this(fluent, instance, false);
  }
  public V2beta1HorizontalPodAutoscalerBuilder(io.kubernetes.client.openapi.models.V2beta1HorizontalPodAutoscalerFluent<?> fluent,io.kubernetes.client.openapi.models.V2beta1HorizontalPodAutoscaler instance,java.lang.Boolean validationEnabled) {
    this.fluent = fluent; 
    fluent.withApiVersion(instance.getApiVersion());

    fluent.withKind(instance.getKind());

    fluent.withMetadata(instance.getMetadata());

    fluent.withSpec(instance.getSpec());

    fluent.withStatus(instance.getStatus());

    this.validationEnabled = validationEnabled; 
  }
  public V2beta1HorizontalPodAutoscalerBuilder(io.kubernetes.client.openapi.models.V2beta1HorizontalPodAutoscaler instance) {
    this(instance,false);
  }
  public V2beta1HorizontalPodAutoscalerBuilder(io.kubernetes.client.openapi.models.V2beta1HorizontalPodAutoscaler instance,java.lang.Boolean validationEnabled) {
    this.fluent = this; 
    this.withApiVersion(instance.getApiVersion());

    this.withKind(instance.getKind());

    this.withMetadata(instance.getMetadata());

    this.withSpec(instance.getSpec());

    this.withStatus(instance.getStatus());

    this.validationEnabled = validationEnabled; 
  }
  io.kubernetes.client.openapi.models.V2beta1HorizontalPodAutoscalerFluent<?> fluent;
  java.lang.Boolean validationEnabled;
  public io.kubernetes.client.openapi.models.V2beta1HorizontalPodAutoscaler build() {
    V2beta1HorizontalPodAutoscaler buildable = new V2beta1HorizontalPodAutoscaler();
    buildable.setApiVersion(fluent.getApiVersion());
    buildable.setKind(fluent.getKind());
    buildable.setMetadata(fluent.getMetadata());
    buildable.setSpec(fluent.getSpec());
    buildable.setStatus(fluent.getStatus());
    return buildable;
  }
  public boolean equals(java.lang.Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    if (!super.equals(o)) return false;
    V2beta1HorizontalPodAutoscalerBuilder that = (V2beta1HorizontalPodAutoscalerBuilder) o;
    if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;

    if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
    return true;
  }
  public int hashCode() {
    return java.util.Objects.hash(fluent,  validationEnabled,  super.hashCode());
  }
  
}