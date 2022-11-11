export interface StarPrintersPlugin {
  echo(options: { value: string }): Promise<{ value: string }>;
}
