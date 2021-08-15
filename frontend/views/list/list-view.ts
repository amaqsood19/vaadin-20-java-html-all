import '@vaadin/vaadin-grid-pro';
import { customElement, html, LitElement } from 'lit-element';

@customElement('list-view')
export class ListView extends LitElement {
  createRenderRoot() {
    // Do not use a shadow root
    return this;
  }

  render() {
    return html`<vaadin-grid-pro id="grid" theme="no-border column-borders"> </vaadin-grid-pro>`;
  }
}
