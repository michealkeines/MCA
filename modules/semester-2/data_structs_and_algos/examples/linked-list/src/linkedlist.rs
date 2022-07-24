pub struct LinkedList<T> {
    head: Option<*mut Node<T>>
}

impl<T: std::fmt::Display> LinkedList<T> {
    pub fn new() -> Self {
        LinkedList {
            head: None
        }
        
    }

    pub fn insert(&mut self, value: T) {
        let mut new_node = Node::new(value);
        if self.head.is_none() {
            self.head = Some(Box::into_raw(Box::new(new_node)));
        } else {
            new_node.next = self.head;
            self.head = Some(Box::into_raw(Box::new(new_node)));
        }
    }

    pub fn traverse(&mut self) {
        if self.head.is_none() { println!("Empty LinkedList"); }
        let mut currnet_node = self.head;
        while let Some(node) = currnet_node {
            unsafe {
                let value = &(*node).value;
                print!("{}->", value);
                currnet_node = (*node).next;
            }
        }
        println!("");

    }
    pub fn reverse(&mut self) {
        let mut current_node = self.head;
        let mut prev_node = None;
        let mut next_node = None;
        
        while let Some(node) = current_node {
            unsafe {
                next_node = (*node).next;
                (*node).next = prev_node;
                prev_node = Some(node);
                current_node = next_node;
            }
        }
        self.head = prev_node;
    }
}

struct Node<T> {
    value: T,
    next: Option<*mut Node<T>>
}

impl<T> Node<T> {
    fn new(value: T) -> Self {
        Node {
            value: value,
            next: None
        }
    }
}

#[cfg(test)]
mod tests {
    use super::*;

    #[test]
    fn insert_nodes() {
        let mut linked_list = LinkedList::new();
        linked_list.traverse();
        linked_list.insert(43);
        linked_list.insert(73);
        linked_list.insert(25);
        linked_list.insert(12);
        linked_list.insert(55);
        linked_list.insert(89);
        linked_list.traverse();
        linked_list.reverse();
        linked_list.traverse();
    }

    #[test]
    fn init_node() {
        let node1: Node<u32> = Node {
            value: 23,
            next: None
        };
        let node2: Node<u32> = Node {
            value: 43,
            next: Some(Box::into_raw(Box::new(node1)))
        };
        let out: u32;
        unsafe {
            out = (*node2.next.unwrap()).value;
        }
        assert_eq!(out, 23);
        println!("{}", out);
        
    }
}