import { customElement, html, LitElement } from 'lit-element';

@customElement('empty-view')
export class EmptyView extends LitElement {
  createRenderRoot() {
    // Do not use a shadow root
    return this;
  }
  render() {
    return html`<div>Content placeholder</div>`;
  }
}
