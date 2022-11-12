import { WebPlugin } from '@capacitor/core';

import type { StarPrintersPlugin } from './definitions';

export class StarPrintersWeb extends WebPlugin implements StarPrintersPlugin {
  async echo(options: { value: string }): Promise<{ value: string }> {
    console.log('ECHO', options);
    return options;
  }

  async test(): Promise<string> {
    return 'It works!';
  }
}
