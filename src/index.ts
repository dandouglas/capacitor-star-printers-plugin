import { registerPlugin } from '@capacitor/core';

import type { StarPrintersPlugin } from './definitions';

const StarPrinters = registerPlugin<StarPrintersPlugin>('StarPrinters', {
  web: () => import('./web').then(m => new m.StarPrintersWeb()),
});

export * from './definitions';
export { StarPrinters };
