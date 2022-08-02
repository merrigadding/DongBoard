class util {
  constructor() {}

  install(str, name = null) {
    this[str] = name
  }
}

const utils = new util()
export default utils
