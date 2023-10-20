import React from 'react';
import {PluginClient, usePlugin, createState, useValue} from 'flipper-plugin';

type Events = {
  connect: string;
};

export function plugin(client: PluginClient<Events, {}>) {
  const messageState = createState<string>("", {persist: 'data'});

  client.onMessage('connect', (message) => {
      messageState.set(message);
  });

  return {messageState};
}

export function Component() {
  const instance = usePlugin(plugin);
  const message = useValue(instance.messageState);

  return (
    <>
      {message}
    </>
  );
}
