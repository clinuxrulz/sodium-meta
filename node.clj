(ns sodium.node)

(def node_code
    (structs
        (struct "Node"
            (var "data" :Gc "NodeData")
        )

        (struct "WeakNode"
            (var "data" :GcWeak "NodeData")
        )

        (struct "NodeData"
            (var "id" (type :int))
            (var "dependents" (type :Set "WeakNode"))
            (var "dependencies" (type :Set "Node"))
            (var "update" (type :FnMut (in :void) (out :void)))
        )
    )
)
