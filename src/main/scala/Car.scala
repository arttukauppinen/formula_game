

class Car {

  var currentGear: Int      = 1  //gear 1 - 5
  var currentDirection: Int = 1  //direction 1 - 8
  var hasCrashed: Boolean   = false


    def getDirection = this.currentGear * this.currentDirection

    def gearUp   = if(this.currentGear < 5) this.currentGear = this.currentGear + 1  else () //can't go over 5
    def gearDown = if(this.currentGear > 0) this.currentGear = this.currentGear - 1  else () //can't go under 0

    def dirRight = if(this.currentDirection < 8) this.currentDirection = this.currentDirection + 1 else () //can't go over 8
    def dirLeft  = if(this.currentDirection > 1) this.currentDirection = this.currentDirection - 1 else () //can't go under 0


}
