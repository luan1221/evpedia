export class Local {
  public name: string;
  public url: string;

  constructor() {
    this.name = "";
    this.url = "";
  }

  getName(): string {
    return this.name;
  }

  setName(name: string): void {
    this.name = name;
  }

  getUrl(): string {
    return this.name;
  }

  setUrl(url: string): void{
    this.url = url;
  }

}


