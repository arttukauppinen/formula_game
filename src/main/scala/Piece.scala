trait Piece {
   //val look = ??? somehow get the picture for each, for formula varying pic?
   val willCrash: Boolean
}

class formulaPiece extends Piece {
  override val willCrash: Boolean = false
}


class roadPiece extends Piece {
  override val willCrash: Boolean = false
}


class wallPiece extends Piece {
  override val willCrash: Boolean = true
}