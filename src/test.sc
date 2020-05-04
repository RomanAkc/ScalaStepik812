case class Pair [T <% Ordered[T]] (first: T, second: T) {
  def smaller =
    if (first < second) first
    else second
}

val p = Pair(BigInt("1000000000000000"), BigInt("7000000000000000"))
p.smaller
//require(p.smaller == BigInt("1000000000000000"))