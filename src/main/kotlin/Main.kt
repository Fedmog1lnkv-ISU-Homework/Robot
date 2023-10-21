enum class Direction {
    UP, DOWN, LEFT, RIGHT
}

fun moveRobot(r: Robot, toX: Int, toY: Int) {
    while (r.x != toX || r.y != toY) {
        val dx = toX - r.x
        val dy = toY - r.y

        when {
            dx > 0 -> {
                while (r.direction != Direction.RIGHT) {
                    r.turnRight()
                }
            }
            dx < 0 -> {
                while (r.direction != Direction.LEFT) {
                    r.turnLeft()
                }
            }
            dy > 0 -> {
                while (r.direction != Direction.UP) {
                    r.turnRight()
                }
            }
            dy < 0 -> {
                while (r.direction != Direction.DOWN) {
                    r.turnLeft()
                }
            }
        }

        r.stepForward()
    }
}

fun printRobots(r1: Robot, r2: Robot) {
    println("Робот 1: ${r1}")
    println("Робот 2: ${r2}")
    println()
}

fun main() {
    val r1 = Robot(3, 4, Direction.RIGHT)
    val r2 = Robot(0, 0, Direction.DOWN)

    println("Стартовые положения")
    printRobots(r1, r2)

    r1.stepForward()
    println("Робот 1: шаг вперёд")
    printRobots(r1, r2)

    r2.turnRight()
    println("Робот 2: поворот направо")
    printRobots(r1, r2)

    moveRobot(r2, 2, 3)
    println("Робот 2: перемещение в точку (2, 3)")
    printRobots(r1, r2)
}